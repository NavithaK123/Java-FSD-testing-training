package day18Assignment;

import java.util.Stack;

public class Capacity {

	public static void main(String[] args) {
		 Stack<String> stack = new Stack<String>();
		  
	        // Use add() method to add elements in the Stack
		    stack.add("My");
	        stack.add("name");
	        stack.add("is");
	        stack.add("Navitha");
	       
	  
	        // Displaying the Stack
	        System.out.println("The Stack is: " + stack);
	  
	        // checking capacity
	        System.out.println("Capacity: "+ stack.capacity());
	        System.out.println("The element is: "+ stack.elementAt(1));
		
	}

}
