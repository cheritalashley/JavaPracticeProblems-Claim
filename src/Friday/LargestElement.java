package Friday;

// Program to find the largest Element of an Array
//1-22-17

import java.util.Scanner;

public class LargestElement {

	public static void main(String[] args) {
		Scanner myArray=new Scanner(System.in);
		System.out.println("Enter values of numbers in the following format: 2 3 4 5 6");
		String values=myArray.nextLine();
		
		String[] userNumbers=values.split(" ");
		int[] numbers=new int[userNumbers.length];
		
		for (int i=0; i<userNumbers.length; i++){
			numbers[i]=Integer.parseInt(userNumbers[i]);
			
		}
		
		int largest=0;
		
		for (int i=0; i<numbers.length; i++){
			if(numbers[i]>largest)
				largest=numbers[i];
			}
		
		System.out.println("Largest number: " + largest);
		
	}

}
