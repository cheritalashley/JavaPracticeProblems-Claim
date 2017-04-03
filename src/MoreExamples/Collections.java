package MoreExamples;

//Example from Instructor, Ken on how to use Collections

import java.util.ArrayList;
import java.util.Iterator;

public class Collections {

	static String cherita = "Cherita";
	static String phillip = "Philip";
	static String renee = "Renee";
	static String mayank = "mayank";
	static String kenn = "Kennedy";
	static String lamar = "Lamar";
	
	public static void main(String args[]){  
		useiterator();
		foreachloop();		
		addall();
		usingremoveall();
		retailall();
		 }  
	
	public static void foreachloop(){  
		 
		 System.out.println("using for loop :");
		 ArrayList<String> al=new ArrayList<String>();  
		  al.add(phillip);  
		  al.add(renee);  
		  al.add(cherita);  
		  al.add(mayank);  
		  for(String obj:al){  
		    System.out.println(obj);
		    }
		  System.out.println("------------------------------------------------\n");
		 }  
	
	public static void useiterator(){  
		System.out.println("using for Iterator :");
		 ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		  list.add(phillip);//Adding object in arraylist  
		  list.add(renee);  
		  list.add(cherita);  
		  list.add(mayank);  
		  //Traversing list through Iterator  
		  Iterator<String> itr=list.iterator();  
		  while(itr.hasNext()){  
		  System.out.println(itr.next());
		 } 
		  System.out.println("------------------------------------------------\n");
		} 
	
	@SuppressWarnings("rawtypes")
	public static void addall(){  
		 
		 
		 ArrayList<String> al=new ArrayList<String>();  
		  al.add(phillip);  
		  al.add(renee);  
		  al.add(cherita);  
		  al.add(mayank);   
		  ArrayList<String> al2=new ArrayList<String>();  
		  al2.add(kenn);  
		  al2.add(lamar);  
		  al.addAll(al2);//adding second list in first list  
		  System.out.println("adding second list in first list  " +al2); 
		  Iterator itr=al.iterator();  
		  while(itr.hasNext()){ 			  
		   System.out.println(itr.next());		  
		  }  
		  System.out.println("------------------------------------------------\n");
		 }  
	
	public static void usingremoveall(){
		 
		 ArrayList<String> al=new ArrayList<String>();  
		  al.add(phillip);  
		  al.add(renee);  
		  al.add(cherita);  
		  al.add(mayank);   
		  ArrayList<String> al2=new ArrayList<String>();  
		  al2.add(kenn);  
		  al2.add(lamar); 
		  al.removeAll(al2);  
		  System.out.println("iterating the elements after removing the elements of al2... " +al2);  
		  @SuppressWarnings("rawtypes")
		  Iterator itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  
		  }  
		  System.out.println("------------------------------------------------\n");
		  } 
	
	public static void retailall(){  
		  ArrayList<String> al=new ArrayList<String>();  
		  al.add(phillip);  
		  al.add(renee);  
		  al.add(cherita); 
		  ArrayList<String> al2=new ArrayList<String>();  
		  al2.add(mayank);  
		  al2.add(cherita); 
		  al.retainAll(al2);  
		  System.out.println("iterating the elements after retaining the elements of al2..." +al2);  
		  @SuppressWarnings("rawtypes")
		  Iterator itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		  System.out.println("------------------------------------------------\n");
		 }  
	
	
		  
}

