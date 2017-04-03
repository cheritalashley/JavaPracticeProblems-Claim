package MoreExamples;

public class Calculations {

	   int z;
	   double bmi;
	
	   public void addition(int x, int y) {
	      z = x + y;
	      System.out.println("The sum of the given numbers:" +x+ " and " + y+ " = " +z);
	      
	   }
		
	   public void Subtraction(int x, int y) {
	      z = x - y;
	      System.out.println("The difference between the given numbers:" +x+ " and " +y+ " = " +z);
	   }
	   
	   public void multiplication(int x, int y) {
		      z = x * y;
		      System.out.println("The product of the given numbers:" +x+ " and " + y+ " =" +z);
		   }
	   	  
		      
	   void getMessage(){
           System.out.println("------------------------------------------");
           System.out.println("BMI Evaluation criteria");           
           System.out.println("------------------------------------------");
    } 
   
	   void underweight(){
           System.out.println("------------------------------------------");
           System.out.println("Less than 18.5 = underweight");           
           System.out.println("------------------------------------------");
    } 
	   void normal(){
           System.out.println("------------------------------------------");
           System.out.println("18.5 to 25 = normal");           
           System.out.println("------------------------------------------");
    }  
	   
	   void overweight(){
           System.out.println("------------------------------------------");
           System.out.println("Between 25 and 30 = overweight");           
           System.out.println("------------------------------------------");
    } 
	   
	   void obese(){
           System.out.println("------------------------------------------");
           System.out.println("Over 30 = obese");           
           System.out.println("------------------------------------------");
    } 
	   

   
    public double getBmi(double w, double h,double c) {
          
           double bmi = (w*c/(h*h));
           return bmi;  
    }
	      
	      
	
	   
	}

 