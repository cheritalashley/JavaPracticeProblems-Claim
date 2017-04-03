package TryCatch;

//Program the calculate the area and circumference of a circle from user input
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab {
	public static void main(String[] args) throws Exception {
	Check();
	}
	
	public static void Check() throws Exception{
		Scanner myInput=new Scanner(System.in);
		try{			
					double answer; 
					double myArea;
					double myCir;
					
					System.out.println("Enter the radius of circle:");
					answer=myInput.nextDouble();
						
					myArea=3.14*((answer*answer));
					System.out.println(myArea);
					
					myCir=3.14*((answer*2));
					System.out.println(myCir);
					myInput.close();
					
			}catch (InputMismatchException ime){
				System.err.println("err Invalid input ");
				
			}catch (ArithmeticException ae){
				System.err.println("Error!!! Invalid input ");
			
			}
		}	

}
