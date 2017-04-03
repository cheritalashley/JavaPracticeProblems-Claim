package Friday;

import java.util.Scanner;

//Program to find sum of user's Array
// 1-21-17

public class SumArray {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter String of numbers in following format: 12 12 34 45 67");
		String word=input.nextLine();
		
		String[] userNumbers=word.split(" ");
		
		int[] numbers=new int[userNumbers.length];
		
		for (int i=0; i<numbers.length; i++){
			numbers[i]=Integer.parseInt(userNumbers[i]);
		}
		
		int sum=0;
		for (int i=0; i<numbers.length;i++){
			sum=sum+numbers[i];
		}
		System.out.println(sum);
				
	}
}
