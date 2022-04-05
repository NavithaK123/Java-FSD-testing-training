package day20;

import java.util.*;

public class DequeueRemoving {

	public static void main(String[] args) {

        // Initializing an deque
        Deque<String> dq
            = new ArrayDeque<String>();
  
        // add() method to insert
        dq.add("To");
        dq.addFirst("Welcome");
        dq.addLast("Java");
  
        System.out.println(dq);
  
        System.out.println(dq.pop());//topand remove
        System.out.println(dq);
        System.out.println(dq.poll());//remove top
        System.out.println(dq);
        System.out.println(dq.pollFirst());
        System.out.println(dq);
        System.out.println(dq.pollLast());
    
	System.out.println(dq);
	}
}

