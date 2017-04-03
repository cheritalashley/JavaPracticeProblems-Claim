package CalculateBMI;

import java.util.Scanner;

public class People {

	double height;
	double weight;
	
	void calculateBMI(){
		Scanner userInput=new Scanner(System.in);
		System.out.println("Enter 1 for USA measurement or 2 for metric measurements.");
		int x=userInput.nextInt();
		
		if (x==1){
			double myBMI=(weight*703/(height*height));
			System.out.println("Your BMI:" + String.format("%.2f", myBMI));
		}else 
			{double myBMI2=(weight*1000/(height*height));
			System.out.println("Your BMI:" + String.format("%.2f", myBMI2));}
		
		
/*		if (myBMI<18.5)
			System.out.println("You are Underweight");
		else if (myBMI<24.9 && myBMI>18.5)
			System.out.println("You are Normal");
		else if (myBMI<29.9 && myBMI>25)
			System.out.println("You are Overweight");
		else
			System.out.println("You are Obese");*/
	}
	
}
