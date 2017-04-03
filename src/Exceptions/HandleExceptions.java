package Exceptions;

// Program that accepts user input (name, telephone, salary), handle exceptions and display friendly error 

import java.util.Scanner;
import java.util.InputMismatchException;

public class HandleExceptions {

	public static void main(String[] args) throws Exception{
		alphebetsOnly();
	}
	
	public static void alphebetsOnly() throws Exception{
		Scanner input=new Scanner(System.in);
		
		try{
			System.out.print("Enter phone number: ");
			long telephone=input.nextLong();
			System.out.print("Enter Name: ");
			String name=input.next();
			System.out.print("Enter Salary: ");
			double salary=input.nextDouble();
			System.out.println("Telephone: " + telephone + "\nName: " + name + "\nSalary: " + String.format("%.2f", salary));
			input.close();
			
		}catch (InputMismatchException ime) {
			System.err.println("Error Invalid input: " + input);
		}catch (ArithmeticException ae){
			System.err.println("Error !! Invalid input : " + input);
		}
		
	}
	
}
