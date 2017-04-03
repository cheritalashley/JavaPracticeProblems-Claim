package ChangingStringsExamples;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter String: ");
		String word=input.nextLine();
		String word2="";
		
		for(int i=word.length()-1; i>=0; i--){
			word2 += word.substring(i, i+1);
		}
		
		if (word.equals(word2)){
			System.out.print(word + " = " + word2 + ": This is a palindrome");	
		}else
			{System.out.print(word +" does not = "+ word2 + ": This is not a palindrome");}
			
	}

}
