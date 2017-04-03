package MoreExamples;


public class AddArrays {

	public static void main(String[] args) {

		int myArray1[]={1,2,3,4};
		int myArray2[]={3,4,5,6};
		int sum1=0;
		int sum2=0;
		int sumArray=0;
		
		for (int counter = 0; counter < myArray1.length; counter++)
			sum1 += myArray1[counter];
					
		for (int counter = 0; counter < myArray2.length; counter++)
			sum2 += myArray2[counter];
						
		sumArray=sum1+sum2;
		
		System.out.println(sum1 + " + " + sum2 + " = " + sumArray);
		System.out.println();
	
		System.out.println("---------Display elements in myArray1----------");
		for (int counter=0; counter <myArray1.length; counter++)
			System.out.println("myArray1["+counter+"] = "+myArray1[counter]);
		
		System.out.println();
		
		System.out.println("---------Display elements in myArray2----------");
		for (int counter=0; counter <myArray2.length; counter++)
			System.out.println("myArray2["+counter+"] = "+myArray2[counter]);
	}
}
