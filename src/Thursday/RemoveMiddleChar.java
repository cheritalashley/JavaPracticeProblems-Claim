package Thursday;

import java.util.Scanner;

//ABC = center number is B eliminate B
//ABCD = center number is BC eliminate both
//if length of string is divisible by 2==0 its even
// int center=input start=substring from(0,center-1); end=substring(center+1)
//else its odd - int center=input/2; start=substring from(0,center); end =substring from(center+1)


public class RemoveMiddleChar {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter string:");
		String value=input.nextLine();
		
		
		int center=value.length()/2;
		String endofString=new String();
		String startofString=new String();
		
		if (value.length()%2==0){
			startofString=value.substring(0, center-1);
			}
		else {
			startofString=value.substring(0, center);	
		}
		endofString=value.substring(center+1);
		System.out.println(startofString+endofString);
	}

}
