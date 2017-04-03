package Friday;

import java.util.Scanner;

//Program that compute average of 100 numbers
//1-18-17

public class ComputeAvg {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter numbers as: 1 2 3 4 5");
		String word=input.nextLine();
		
		// have the user input numbers separated by space: ex. 12 123 123 123 124 124 567 
		String[] numberString=word.split(" ");
		
		//declare an array called number thats the same size of the users string
		int[]numbers = new int[numberString.length];
		
		//loop thru the array the length of the string times and pass each element into the new array
		for(int i=0; i<numberString.length; i++){
			numbers[i]=Integer.parseInt(numberString[i]);//Integer.parseInt allows you to pass a string to int
			}
		
		int avg=avg(numbers);
		
		System.out.println("the avg is: " + avg);
		
		int count = 0;
		
		for(int i=0; i<numbers.length;i++){
			if (numbers[i]>avg){
				count++;
			}
		}
		System.out.println("there are "+count+ " above the avg");
		input.close();	
	}
	
	public static int avg(int[] numbers){
		int size=numbers.length;
		int value=sum(numbers);
		return value/size;
	} 
	
	public static int sum(int[] numbers){
		int sum = 0;
		for (int i=0; i<numbers.length; i++){
			sum +=numbers[i];}
		return sum;
		}
	
		
}
