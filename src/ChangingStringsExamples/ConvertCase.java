package ChangingStringsExamples;

//Program to convert every even position to uppercase and every odd position to lowercase
//1-19-17 

import java.util.Scanner;

public class ConvertCase {
 
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter String: ");
		String str=input.nextLine();
		
		for(int i=0; i<str.length(); i++){
			String letter=str.substring(i, i+1);
			if (i%2==0){
				System.out.print(letter.toUpperCase());
			}else {
				System.out.print(letter.toLowerCase());
			}
		}

	}


}
