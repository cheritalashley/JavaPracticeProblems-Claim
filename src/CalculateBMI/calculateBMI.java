package CalculateBMI;

import java.util.Scanner;

public class calculateBMI {

	public static void main(String[] args) {
		Scanner myInput=new Scanner(System.in);
		System.out.print("Enter your height in feet");
		double heightFeet=myInput.nextDouble();
		System.out.print("Enter your height in inches: ");
		double heightInches=myInput.nextDouble();
		
		double allInches=(heightFeet*12)+heightInches;
		
		System.out.print("Enter your weight in pounds: ");
		double weight=myInput.nextDouble();
		
		double myBMI=(weight*703/(allInches*allInches));
		System.out.println("Your BMI: " + String.format("%.2f", myBMI));

	}

}
