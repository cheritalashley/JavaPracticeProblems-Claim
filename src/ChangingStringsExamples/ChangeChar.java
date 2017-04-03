package ChangingStringsExamples;

//Prints the Numerical Value of an user alphabet letter
//1-18-17

import java.util.Scanner;

public class ChangeChar {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Please enter a letter: ");
		
		String letter=input.nextLine();
		char letter2=letter.charAt(0);
		
		int num=(int) letter2;
		
		System.out.println("The value of the letter is: " + num);
	}

}
