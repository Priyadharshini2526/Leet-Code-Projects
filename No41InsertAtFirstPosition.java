package Leetcode;
import java.util.ArrayList;

public class No41InsertAtFirstPosition {
	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("Blue");
		colors.add("Green");
		colors.add("Yellow");
		colors.add("Red");
		colors.add("Purple");
		
		System.out.println("Original List: " + colors);
		colors.add(0, "Red");
		System.out.println("Updated LIst after inserting at first position: " + colors);
	}

}
