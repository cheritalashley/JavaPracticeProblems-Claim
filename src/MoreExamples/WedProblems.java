package MoreExamples;

//Multi-Program for All Wednesdays Assignments using Methods

import java.util.InputMismatchException;
import java.util.Scanner;

public class WedProblems {

	public static void main(String[] args) {
		
		int problem=ChooseProblem();
				
		switch (problem){
		case 1:
			Area();
			break;
		case 2:
			AreaTriangle();
			break;
		case 3:
			OddEven();
			break;
		case 4:
			ChangeType();
			break;
		case 5:
			ChangeChar();
			break;
		case 6:
			ChangeInt();
			break;
		case 7:
			LeapYear();
			break;
		default: System.out.print("You did not choose a valid number");
		}
	}

	public static int ChooseProblem(){
		Scanner myInput=new Scanner(System.in);
		System.out.println("Enter the problem number (1-7):"+
		"\n" +"1. Calculate Area and Circumference of a Circle"+
		"\n" +"2. Calculaten the Area of a Triangle"+
		"\n" +"3. Check number if Odd or Even"+
		"\n" +"4. Change Int to Double value"+
		"\n" +"5. Display numerical value of char"+
		"\n" +"6. Change Double to Int value"+
		"\n" +"7. Check number if Leap Year");
		int problem=myInput.nextInt();
		
		return problem;
		}
	
	public static void Area(){
		Scanner myInput=new Scanner(System.in);
		System.out.print("Enter the radius of circle: ");
		double answer=myInput.nextDouble();
		
		double myArea; 
		myArea=3.14*((answer*answer));
		
		double myCir; 
		myCir=3.14*((answer*2));
		//Used String.formate("%.2f", myCir) to only have 2 digits print out on circumference 
		System.out.println("Area: " + myArea+ "\n" + "Circumference: " + String.format("%.2f", myCir));
		}
	
	public static void AreaTriangle(){
		Scanner myInput=new Scanner(System.in);
		System.out.print("What is the value of the base-width of a triangle: ");
		double answer1=myInput.nextDouble();
		
		System.out.print("What is the value of the height of a triangle: ");
		double answer2=myInput.nextDouble();
		
		double area;
		area=(answer1*answer2)/2;
		System.out.println("The area of the triangle is: " + area);
		}
	
	public static void OddEven(){
		 Scanner myInput=new Scanner(System.in);
		 System.out.print("Enter your number: ");
		 int num=myInput.nextInt();
		 if (num%2==0){
			System.out.println("Your number is Even");	
		}else 
			System.out.println("Your number is Odd");
		}

	public static void ChangeType() {
		Scanner myInput=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number=myInput.nextInt();
		System.out.println("You entered: " + number + ", change to double: " + (double)number);
		}
	
	public static void ChangeChar(){
		Scanner myInput=new Scanner(System.in);
		System.out.print("Please enter a letter: ");
		String letter=myInput.nextLine();
		System.out.println("letter: " + letter + ", value : " + (int) letter.charAt(0));
		}

	public static void ChangeInt(){
		Scanner myInput=new Scanner(System.in);
		System.out.print("Enter a number: ");
		double numInt=myInput.nextDouble();
		System.out.println("You entered " + numInt + ", " + "the new value is " + (int) numInt);
		}
	 
	public static void LeapYear(){
		Scanner myInput=new Scanner(System.in);
		System.out.print("Enter a 4 digit number: ");
		int year=myInput.nextInt();
			
		boolean myYearBoolean=true;
								
		if (year%4 == 0)
			{		
			if (year%100 != 0)
				{myYearBoolean=true;
				}else
					{if (year%400 != 0)
					{myYearBoolean=false;
					}else
					{myYearBoolean=true;}
				}
			}else 
				{myYearBoolean=false;}
	 		
		if (myYearBoolean){
		System.out.println("You entered " + year + ". It is a leap year.");
		}else
		System.out.println("You entered " + year + ". It is not a leap year.");
	 }


}
