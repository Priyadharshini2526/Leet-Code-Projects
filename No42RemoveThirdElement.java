package Leetcode;
import java.util.ArrayList;

public class No42RemoveThirdElement {
	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<>();
		
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Elephant");
		animals.add("Lion");
		animals.add("Tiger");
		
		System.out.println("Original LIst: " + animals);
		
		if(animals.size() >= 3) {
			animals.remove(2);
			
			System.out.println("Update List after removing third elements: " + animals);
			
		}else {
			System.out.println("List doesn't have enough elements to remove the third one.");
			
		}
	}

}
