package ChangingStringsExamples;

// Program to reverse a user's input word
// 1-19-17

import java.util.Scanner;

public class ReverseOrder {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter String: ");
		String str=input.nextLine();

		for(int i=str.length()-1; i>=0; i--){
			
			System.out.print(str.charAt(i));
			
		}
	}

}
