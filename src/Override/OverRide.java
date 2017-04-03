package Override;


public class OverRide {

	public static void main(String[] args) {
		OverRide measurements=new OverRide();
		measurements.myMeasurements(70, 48);
		measurements.myMeasurements(100, 60);
		measurements.myMeasurements(133, 62);
	}
	
	public void myMeasurements(int weight, int height){
		int myBMI=(weight*703)/(height*height);
		System.out.println("Your BMI: " + String.format("%.2f", myBMI));
		
	
		if (myBMI<18.5)
			System.out.println("You are Underweight");
		else if (myBMI<24.9 && myBMI>18.5)
			System.out.println("You are Normal");
		else if (myBMI<29.9 && myBMI>25)
			System.out.println("You are Overweight");
		else
			System.out.println("You are Obese");
	}
	
	public void myMeasurements(double weight, double height){
		double myBMI=(weight*703)/(height*height);
		System.out.println("Your BMI: " + String.format("%.2f", myBMI));
		
		if (myBMI<18.5)
			System.out.println("You are Underweight");
		else if (myBMI<24.9 && myBMI>18.5)
			System.out.println("You are Normal");
		else if (myBMI<29.9 && myBMI>25)
			System.out.println("You are Overweight");
		else
			System.out.println("You are Obese");
	}
}