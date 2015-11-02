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
