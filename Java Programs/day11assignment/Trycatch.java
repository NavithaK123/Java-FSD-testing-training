package day11assignment;

import java.util.Scanner;

public class Trycatch {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string size less than 20");
    String s=sc.next();
    
    try {
    System.out.println(s.charAt(25));
    }
    catch(Exception e) {
    	
    	
    	System.out.println(e);
    }
    System.out.println(" end of code");
    }
    
}
