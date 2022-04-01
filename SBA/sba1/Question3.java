package sba1;
//Create two arraylist of strings to take First_name and Last_name of the students,
//and print their whole name.

import java.util.ArrayList;
import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the number of students");
	     int n=sc.nextInt();
		ArrayList<String> a1= new  ArrayList<String>();
		ArrayList<String> a2= new  ArrayList<String>();
	    for(int i=1;i<=n;i++) {
	    	 System.out.println("enter first name ");
	    	a1.add(sc.next());
	         System.out.println("enter the second name");
	    		a2.add(sc.next());
	    }
	    for(int i=0;i<n;i++) {
		    	System.out.println("fullname :"+a1.get(i)+" "+a2.get(i));
	  

	}
}}
