public class Calculator {
	
	public void add(int x, int y) {
		System.out.println(x + " plus " + y + " is " + (x + y));
	}
	
	public void subtract(int x, int y) {
		System.out.println(x + " minus " + y + " is " + (x - y));
	}
	
	public void multiply(int x, int y) {
		System.out.println(x + " multiplied " + y + " is " + (x * y));
	}
	
	public void divide(int x, int y) {
		double xx = (double) x;
		double yy = (double) y;
		System.out.println(x + " divided " + y + " is " + (xx / yy));
	}
	
	public void modulus(int x, int y) {
		System.out.println(x + " modulus " + y + " is " + (x % y));
	}
}
