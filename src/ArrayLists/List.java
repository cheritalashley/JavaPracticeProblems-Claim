package ArrayLists;


public class List {

	public static void main(String[] args) {
		
		int[] myArray=new int[3];
		
			myArray[0]=14;
			myArray[1]=2;
			myArray[2]=58;
			
		int sum = 0;
		int max = 0;
		
		for (int i=0; i<=myArray.length-1; i++){
			if (myArray[i]>max)
				{max=myArray[i];}
			sum +=myArray[i];
		}	
		System.out.println("Sum = " + sum +"\n"+ "Max = "+ max);
		}
		double[] myList={4,5,6,7,8,9};

}
