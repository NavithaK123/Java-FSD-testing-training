package day19;

import java.util.*;

public class TestJavaCollection4 {
	//Creating Deque and adding elements 
	public static void main(String[] args) {
	Deque<String> deque = new ArrayDeque<String>();  
	deque.add("Gautam");  
	deque.add("Karan");  
	deque.add("Ajay");  
	//Traversing elements  
	for (String str : deque) {  
	System.out.println(str);  
	}  
}}
