/*

Create a class Matrix that has a 2-D array of integers as a field. The class
should have methods for:

	• a constructor method Matrix(int,int) setting the size of the array as two
	  integers (not necessarily the same). All elements in the matrix should be
	  initialised to 1.

	• a method setElement(int,int,int) to modify one element of the array,
	  given its position (the first two integers) and the new value to be put
	  in that position (the third integer). The method must check that the
	  indeces are valid before modifying the array to avoid an
	  IndexOutOfBoundsException. If the indeces are invalid, the method will do
	  nothing and the third argument will be ignored.

	• a method setRow(int,String) that modifies one whole row of the array,
	  given its position as an integer and the list of numbers as a String like
	  “1,2,3”. The method must check that the index is valid and the numbers
	  are correct (i.e. if the array has three columns, the String contains
	  three numbers). If the index or the String is invalid, the method will do
	  nothing.

	• a method setColumn(int,String) that modifies one whole column of the
	  array, given its position as an integer and the list of numbers as a
	  String like “1,2,3”. The method must check that the index is valid and
	  the numbers are correct (i.e. if the array has four rows, the String
	  contains four numbers). If the index or the String is invalid, the method
	  will do nothing.

	• a method toString() that returns the values in the array as a String
	  using square brackets, commas, and semicolons, e.g.
	  “[1,2,3;4,5,6;3,2,1]”.

	• A method prettyPrint() that prints the values of the matrix on screen in
	  a legible format. Hint: you can use the special character ’\t’
	  (backslash-t) to mark a tabulator so that all numbers are placed in the
	  same column regardless of their size. You can think of a tabulator
	  character as a move-to-the-next-column command when printing on the
	  screen.

Create a Groovy program that uses all those methods from the Matrix class:
creates matrices, modifies its elements (one-by-one, by rows, and by columns),
and prints the matrix on the screeen.

*/

public class No_03_Creating_Matrices {

	public static void main(String[] BirkbeckRulez) {

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Please enter the desired size of the Matrix:");
		System.out.println();
		System.out.print("Number of rows: ");
		String str = System.console().readLine();
		int rows = Integer.parseInt(str);
		System.out.print("Number of columns: ");
		str = System.console().readLine();
		int columns = Integer.parseInt(str);

		Matrix myOwnMatrix = new Matrix(rows, columns);

		myOwnMatrix.prettyPrint();

		System.out.println("How about changing an element?");
		System.out.println();
		System.out.print("Enter the row number: ");
		str = System.console().readLine();
		int x = Integer.parseInt(str);
		System.out.print("Enter the column number: ");
		str = System.console().readLine();
		int y = Integer.parseInt(str);
		System.out.print("Enter the value: ");
		str = System.console().readLine();
		int z = Integer.parseInt(str);

		myOwnMatrix.setElement(x, y, z);

		myOwnMatrix.prettyPrint();

		System.out.println("Now how about changing a whole row?");
		System.out.println();
		System.out.print("Enter the row number: ");
		str = System.console().readLine();
		int row = Integer.parseInt(str);
		System.out.print("Enter the row: ");
		str = System.console().readLine();

		myOwnMatrix.setRow(row, str);

		myOwnMatrix.prettyPrint();

		System.out.println("Now how about changing a whole column?");
		System.out.print("Enter the column number: ");
		str = System.console().readLine();
		int column = Integer.parseInt(str);
		System.out.print("Enter the column: ");
		str = System.console().readLine();

		myOwnMatrix.setColumn(column, str);

		myOwnMatrix.prettyPrint();

		String matrixInAString = myOwnMatrix.toStringgg();

		System.out.println();
		System.out.println("Finally here is your Matrix in a String:");
		System.out.println();
		System.out.println(matrixInAString);
		System.out.println();
		System.out.println("Have a nice day!");
		System.out.println();

	}
}
