package Leetcode;
import java.util.ArrayList;

public class No40ArrayListExample {
	public static void main(String[] args) {
		//Create a new rray list of Strings
		ArrayList<String> fruits = new ArrayList<>();
		
		//Add elements to the Arraylist
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Grapes");
		
		//Print out the Arraylist
		System.out.println("Fruits list:");
		for (String fruit : fruits)
		{
			System.out.println(fruit);
				}
		}

}
