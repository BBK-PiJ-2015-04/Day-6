public class Matrix {
	
	private int[][] mat;
	
	public Matrix(int x, int y) {
		mat = new int[x][y];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				mat[i][j] = 1;
			}
		}
	}
	
	public void setElement(int x, int y, int z) {
		int height = mat.length;
		int width = mat[0].length;
		if(x <= height && y <= width) {
			mat[x - 1][y - 1] = z;
		}
	}
	
	public void setRow(int x, String str) {
		int height = mat.length;
		int width = mat[0].length;
		if (x <= height && rowValid(str) == true) {
			int row[] = rowToNumbers(str);
			if (row.length == width) {
				for (int i = 0; i < row.length; i++) {
					mat[x - 1][i] = row[i];
				}
			}
		}
	}
	
	public void setColumn(int y, String str) {
		int height = mat.length;
		int width = mat[0].length;
		if (y <= width && rowValid(str) == true) {
			int row[] = rowToNumbers(str);
			if (row.length == height) {
				for (int i = 0; i < row.length; i++) {
					mat[i][y - 1] = row[i];
				}
			}
		}
	}
	
	public String toStringgg() { // The name toString is not allowed!
		String matty = "[";
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[0].length; j++) {
				matty = matty + Integer.toString(mat[i][j]);
				if((j + 1) == mat[0].length) {
					matty = matty + ";";
				}
				else {
					matty = matty + ",";
				}
			}
		}
	matty = matty.substring(0, matty.length() - 1) + "]";
	return matty;
	}
	
	public void prettyPrint() {
		System.out.println();
		System.out.println("Here is your Matrix:");
		System.out.println();
		int width = mat.length;
		int height = mat[0].length;
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				if (j == 0){
					System.out.print ("[");
				}
				if ((j + 1) == height) {
					System.out.println(mat[i][j] + "]");
				}	
				else {
					System.out.print(mat[i][j] + "\t");
				}
			}
		}
		System.out.println();
	}
	
	private boolean rowValid(String str) {
		if(str.charAt(0) < 48 || str.charAt(0) > 57) {
			return false; // If the first character is not a number then fail!
		}
		// Next let's check all the other characters are numbers or commas
		for(int i = 0; i < str.length(); i++) {
			if(!((str.charAt(i) > 47 && str.charAt(i) < 58) || str.charAt(i) == ',')) {
				return false;
			}
		}
		// Now let's check that the last character is not a comma
		if(str.charAt(str.length() - 1) == ',') {
			return false;
		}
		return true;
	}

	private int[] rowToNumbers(String str) {
		int numberCounter = 1;
		for(int i = 0; i < (str.length() - 1); i++) {
			if(str.charAt(i) == ',') {
				numberCounter++;
			}
		}
		String[] numbers;
		numbers = new String[numberCounter];
		int commaPosition = 0;
		int commaCounter = 0;
		for(int i = 0; i < (str.length() - 1); i++) {
			if(str.charAt(i) == ',') {
				numbers[commaCounter] = str.substring(commaPosition, i);
				commaCounter++;
				commaPosition = i + 1;
			}
			numbers[commaCounter] = str.substring(commaPosition, i + 2);
		}	
		int[] numbs;
		numbs = new int[commaCounter + 1];
		for (int i = 0; i <= commaCounter; i++) {
			numbs[i] = Integer.parseInt(numbers[i]);
		}	
	return numbs;
	}
}
