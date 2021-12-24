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

	}

}
