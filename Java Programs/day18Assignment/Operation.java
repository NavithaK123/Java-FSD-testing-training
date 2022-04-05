package day18Assignment;

import java.util.Stack;

public class Operation {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		 // Use add() method to add elements in the Stack
       stack.add("hii");
       stack.add("good");
       stack.add("morning");
      // Displaying the Stack
       System.out.println("The Stack is: " + stack);
       //
       System.out.println("The  occurrence of good  at index: "+ stack.indexOf("good"));
    // Clearing the Stack using clear() method
       stack.clear();
// Displaying the final Stack after clearing;
       System.out.println("The final Stack: " + stack);

	}

}
	
