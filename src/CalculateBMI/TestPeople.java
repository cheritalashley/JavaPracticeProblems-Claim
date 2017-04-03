package CalculateBMI;

import java.util.Scanner;

/*public class TestPeople {

	public static void main(String[] args) {
		Scanner myInput=new Scanner(System.in);
		System.out.print("Enter your height in inches:");
				
		People cherita=new People();
			
		cherita.height=myInput.nextDouble();
		
		System.out.print("Enter your weight:");
		cherita.weight=myInput.nextDouble();
		cherita.calculateBMI();
	}
}*/

public class TestPeople extends People {

	public static void main(String[] args) {
	Scanner myInput=new Scanner(System.in);
	System.out.print("Enter your height in inches:");
			
	People inherited= new People();
	inherited.height=myInput.nextDouble();
	
	System.out.print("Enter your weight:");
	inherited.weight=myInput.nextDouble();
	inherited.calculateBMI();
	}

}
