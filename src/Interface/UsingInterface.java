package Interface;


public class UsingInterface implements MyInterface {

	public static void main(String[] args) {
		UsingInterface imp = new UsingInterface();
		imp.divide(16, 4);

	}
	
	@Override
	public void divide(int x, int y){
		int z=x/y;
		System.out.println("This is implemented from interface");
		System.out.println("The quotient of the given numbers:" + x + " and " + y + " = "+ z);
	}
}
