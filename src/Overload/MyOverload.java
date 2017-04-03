package Overload;

// Cherita Lashley
// 1-24-17
// Polymorphism Method Overload to Calculate Avg with the following:
// 1) Pass 2 integer parameters
// 2) Pass 2 double parameters
// 3) pass 3 integer parameters

public class MyOverload {

	public static void main(String[] args) {
		MyOverload avg=new MyOverload();
		avg.Avg(20, 40);
		avg.Avg(30.5, 50.6);
		avg.Avg(20,30,60);
	}

	public void Avg(int num1, int num2){
		int sum=num1+num2;
		int avg=sum/2;
		System.out.println("My avg: " + avg);
	}
	
	public void Avg(double num1, double num2){
		double sum=num1+num2;
		double avg=sum/2;
		System.out.println("My avg: " + avg);
	}
	
	public void Avg(int num1, int num2, int num3){
		int sum=num1+num2+num3;
		int avg=sum/2;
		System.out.println("My avg: " + avg);
	}
}
