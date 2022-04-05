package day18Assignment;

import java.util.Stack;

public class Stackk {

	public static void main(String[] args) {
		Stack <Character>stk=new Stack <Character>();
		stk.add('n');
		stk.add('a');
		stk.add('m');
		stk.add('e');
		System.out.println("stack elements are"+stk);
		System.out.println("The first element: "+stk.firstElement());
		System.out.println("Contain Character G:  "+stk.contains('G'));
		System.out.println("Character in 2 nd index:  "+stk.get(2));
		stk.set(0,'G');
		System.out.println("setting index at 0 is G  "+stk);
		System.out.println("The stack size: "+stk.size());
		System.out.println("The stack is empty : "+stk.empty());
		System.out.println("Capacity: "+ stk.capacity());
		//equals
		Stack<String> stk2 = new Stack<String>();
		  
	        // Use add() method to add elements in the Stack
	        stk2.add("name");
	        stk2.add("is");
	        stk2.add("navitha");
	        //equal
	        System.out.println("Are both of them equal? " + stk.equals(stk2));
	        //CONTAINSALL
	        System.out.println("\nDoes stack 1 contains stack 2: "+ stk.containsAll(stk2));
	  
	        Stack<String> stk3 = new Stack<String>();
			  
	        // Use add() method to add elements in the Stack
	        stk3.add("name");
	        stk3.add("is");
	        stk3.add("navitha");
	        //equal
	        System.out.println("Are both of them equal? " + stk3.equals(stk2));
	        //CONTAINSALL
	        System.out.println("\nDoes stack 3 contains stack 2: "+ stk3.containsAll(stk2));
	        System.out.println("The  occurrence of is  at index: "+ stk2.indexOf("is"));
	        System.out.println("The element is: "+ stk2.elementAt(0));
	        // Clearing the Stack using clear() method
	        stk3.clear();
	        // Displaying the final Stack after clearing;
	        System.out.println("The final Stack: " + stk3);

	}

}
