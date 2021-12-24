package application;

public class App {

	public static void main(String[] args) {
		// you can have more than two dimensional arrays, 
		// but they are rare
		
		String[][] words = new String[][] {
			{"one", "two", "three"},
			{"apple", "orange", "banana"},
			{"fox", "cat", "horse"}
		};
		
		// change the 2nd element of the 2nd array
		words[1][1] = "cherry";

		// try to iterate using a for each loop
		for(String[] subArray: words) {
			for(String word: subArray) {
				System.out.printf("%s\t", word);
			}
			System.out.println();
		}
		
		/* Coding challenge
		 * Make a 3x3 array of type int
		 * Loop through the array and output all values on the diagonal
		 * from top left to bottom right.
		 * Add these values and print the total.
		 */
		
		int[][] numberArray = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};

		int total = 0;
		
		for(int i = 0; i < numberArray.length; i++) {
			total += numberArray[i][i];
		}
		
		System.out.println(total);
	}

}
