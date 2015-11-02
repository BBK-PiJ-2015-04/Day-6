/*

Create a Java class called Calculator. The class should implement the following
methods, each of them printing the result on the screen:-

	• add(int, int)
	• subtract(int, int)
	• multiply(int, int)
	• divide(int, int)
	• modulus(int, int)

Note that you will will need to cast the parameters into double to perform
exact division.

Write a small Groovy or Java Decaf program that uses all the methods of
Calculator.

*/

public class No_01_Dividing_Integers{

	public static void main(String[] BirkbeckRulez) {

		Calculator aDummyCalculator = new Calculator();
		
		System.out.print("Enter the first number: ");
		String str = System.console().readLine();
		int x = Integer.parseInt(str);
		
		System.out.print("Enter the second number: ");
		str = System.console().readLine();
		int y = Integer.parseInt(str);
		
		aDummyCalculator.add(x, y);
		
		aDummyCalculator.subtract(x, y);
		
		aDummyCalculator.multiply(x, y);
		
		aDummyCalculator.divide(x, y);
		
		aDummyCalculator.modulus(x, y);

	}

}
