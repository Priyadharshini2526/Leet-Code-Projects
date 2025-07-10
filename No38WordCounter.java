package Leetcode;

public class No38WordCounter {
	//Method to count words in a string
	public static int CountWords(String input) {
		if(input == null || input.trim().isEmpty()) {
			return 0;
		}
		//Split the string by spaces using regular experssion
		String[] words = input.trim().split("\\s+");
		return words.length;
	}
	//Main method to test the function
	public static void main(String[] args) {
		String text = "Java is a powerful programming language";
		int WordCount = CountWords(text);
		System.out.println("Total words: " + WordCount);
		
	}

}
