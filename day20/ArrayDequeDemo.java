package day20;

import java.util.*;

public class ArrayDequeDemo {
	public static void main(String[] args)
    {
        // Initializing an deque
        Deque<String> dq = new ArrayDeque<String>();
  
        // add() method to insert
        dq.add("To");//tail side
        dq.addFirst("Welcome");
        dq.addLast("Java");
  
        System.out.println(dq);
    }
}
