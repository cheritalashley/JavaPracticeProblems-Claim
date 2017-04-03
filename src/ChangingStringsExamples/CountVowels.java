package ChangingStringsExamples;

//Program that count all the vowels in a string
// 1-19-17

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter String: ");
		String str=input.nextLine();
		
		int count=0;
		int num=0;
		char letters;
				
		for (int i=0; i<str.length();i++ ){
			letters=str.charAt(i);
			if(letters == 'a' || letters == 'e' || letters == 'i'|| letters == 'o' || letters == 'u')
			count++;
			else if (letters != 'a' &&  letters != 'e' && letters != 'i' && letters !='o' && letters !='u')
			num++;
		}
		System.out.println("number of vowels:" + count);
		
	}

}
