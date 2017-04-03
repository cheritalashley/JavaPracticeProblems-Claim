package ChangingStringsExamples;

// 1-17-17
// Program that determines if a user's string has all unique characters

import java.util.Scanner;

public class UniqChar {

public static void main(String[] args) {

        System.out.println("Enter A String");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        boolean result=true;
    
        for(int i=0; i < str.length();i++){
            char currentLetter=str.charAt(i);
        for(int j=i+1; j < str.length();j++){
            char nextLetter=str.charAt(j);
        	if (currentLetter==nextLetter)
        	result=false;
        }                
       } 
        System.out.println(result);
    }
	
}