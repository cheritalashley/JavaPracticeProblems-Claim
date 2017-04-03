package MoreExamples;

import java.util.InputMismatchException;
import java.util.Scanner;

 public class Bmi extends Calculations {
	 public static void main( String[] args ) {
	        @SuppressWarnings("resource")
	              Scanner keyboard = new Scanner(System.in);
	        double m, kg;
	        int c;
	        int select;
	        double bmi;
	       
	        Calculations inherited = new Calculations();       
	        System.out.print( "select 1 for metric or 2 for Imperial: " );
	        select = keyboard.nextInt();        
	        
	        
	        switch (select) {
	       
	        case 1:
	             c = 1000;
	            System.out.println("You selected One: " + select+ ": (metric) Your height in m: ");
	            
	            try{
	            	m = keyboard.nextDouble();
	            	if (m<=0){
	            		throw new ArithmeticException();
	            	}
	            
	            System.out.print( "Your weight in w: " );
	            kg= keyboard.nextDouble(); 
	            if (kg<=0){
            		throw new ArithmeticException();
	            }
	            bmi=inherited.getBmi(m,kg,c);
	            System.out.println( "Your BMI is " +bmi);
	            getStatus(bmi);
	            }catch (InputMismatchException ime){
	            	System.err.println("error Numbers inputs only: ");
	            	
	            }catch (ArithmeticException ae){
	            	System.err.println("Weight can't be less than or equal to zero!");
	           
	            }
	            break;
	             
	        case 2:
	              c = 703;
	                  System.out.println("Selected two: " + select);
	                  System.out.print( "Your height in inches: " );
	            m = keyboard.nextDouble();
	            System.out.print( "Your weight in lbs: " );
	            kg = keyboard.nextDouble();
	            bmi=inherited.getBmi(m,kg,c);           
	                  System.out.println( "Your BMI is " +inherited.getBmi(m,kg,c)+ "");
	                  getStatus(bmi);
	               
	               break;
	       
	              default:
	              System.out.println("Invalid entry.");
	              break;
	        
	       }
	      }
	 
	       public static void getStatus(double bmi) {
	    	   Bmi Bmi = new Bmi();
	    	   Bmi underweight=new Bmi();
	    	   Bmi normal=new Bmi();
	    	   Bmi overweight=new Bmi();
	    	   Bmi obese=new Bmi();
	    	   
	       if (bmi < 18.5) {
	                underweight.underweight();
	                
	              } else if (bmi < 25) {
	                  normal.normal();

	              } else if (bmi < 30) {
	                     overweight.overweight();

	              } else {
	                     obese.obese();

	              }
	             Bmi.getMessage(); // Overridden method
	       }
	      
	       @Override
	       void getMessage(){
	           System.out.println("------------------------------------------");
	           System.out.println("BMI Evaluation criteria");
	           System.out.println("Less than 18.5 = underweight");
	           System.out.println("18.5 to 25 = normal");
	           System.out.println("Between 25 and 30 = overweight");
	           System.out.println("Over 30 = obese");  
	           System.out.println("------------------------------------------");
	        } 
	       
	       @Override
		   void underweight(){
	           System.out.println("------------------------------------------");
	           System.out.println("underweight");           
	           System.out.println("------------------------------------------");
	    } 
	       @Override
		   void normal(){
	           System.out.println("------------------------------------------");
	           System.out.println("normal");           
	           System.out.println("------------------------------------------");
	    }  
	       @Override
		   void overweight(){
	           System.out.println("------------------------------------------");
	           System.out.println("overweight");           
	           System.out.println("------------------------------------------");
	    } 
	       @Override
		   void obese(){
	           System.out.println("------------------------------------------");
	           System.out.println("obese");           
	           System.out.println("------------------------------------------");
	    } 

	    }