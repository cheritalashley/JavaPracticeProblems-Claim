package MoreExamples;


public class UsingComputeNumber extends ComputeNumber{

	public static void main(String[] args) {
		UsingComputeNumber comp=new UsingComputeNumber();
		comp.compute(2,6);
	}
	
	@Override
	public void compute(int x, int y){
		z=x*y;
		System.out.println("Hi this is from the sub Class overriding the Super");
		System.out.println("The sum of the given numbers: " + x + " * " +  y + " = " + z);
	}
}
