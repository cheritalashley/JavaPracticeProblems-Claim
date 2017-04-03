package MakingChange;

//Cherita Lashley
//Program to give change to a user's input
//1-21-17

import java.util.Scanner;

public class MakingChange {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your change: ");
		int change=input.nextInt();
		
		int quarters=25;
		int dimes=10;
		int nichels=5;
		int pennies=1;
		int countQ=0, countD=0, countN=0, countP=0;
		
		while (change>=25){
			countQ=countQ+1;
			change=change-quarters;
			}
				
		while (change>=10){
  			countD=countD+1;
			change=change-dimes;
			}
	
		while (change>=5){
			countN=countN+1;
			change=change-nichels;
			}
		
		while (change>=1){
			countP=countP+1;
			change=change-pennies;
			}
		
		if (countQ>0)
			System.out.println("Quarters: " + countQ);
		if (countD>0)
			System.out.println("Dimes: " + countD);
		if (countN>0)
			System.out.println("Nichels: " + countN);
		if (countP>0)
				System.out.println("Pennies: " + countP);
			
	}

}
