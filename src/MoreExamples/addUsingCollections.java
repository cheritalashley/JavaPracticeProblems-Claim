package MoreExamples;

import java.util.ArrayList;
import java.util.List;

public class addUsingCollections {

	public static void main(String[] args) {
		ArrayList<String> myArray=new ArrayList<String>();
		myArray.add("One");
		myArray.add("Two");
		myArray.add("Three");
		myArray.add("Four");
		System.out.println("---------------Using Normal Way--------------------");
		System.out.println(myArray);
		
		List<String> myArray2=new ArrayList<String>();
		myArray2.add("Five");
		myArray2.add("Six");
		myArray2.add("Seven");
		myArray2.add("Eight");
		myArray.addAll(myArray2);
		System.out.println();
		System.out.println("---------------Using Copy--------------------");
		System.out.println(myArray);
		
		System.out.println();
		System.out.println("---------------Using For Loop--------------------");
		for (String array:myArray)
			System.out.print(array + " , ");
		
	}

}
