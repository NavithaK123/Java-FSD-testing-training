package sba1;
//Create a arraylist of integers and find the sum and average of the entire list.

import java.util.ArrayList;
import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		 ArrayList<Integer> a1= new  ArrayList<Integer>();
		    Scanner sc=new Scanner(System.in);
		    System.out.println("enter the no of  elements");
		    int n=sc.nextInt();
		    System.out.println("enter the elements");
		    for(int i=0;i<n;i++) {
		    	a1.add(sc.nextInt());
		    }
		    System.out.println("The array list: "+a1);
		    int sum=0;float avg;
		    for( int i=0;i<n;i++) {
		    	sum=sum+a1.get(i);
		    	
		    
		    	
		    }
		    System.out.println("sum ="+sum);
		    avg=sum/n;
		    
		    System.out.println("average = "+avg);
		    
		    
		    

}}
