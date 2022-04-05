package day13Assignment;

import java.util.*;

//.Write a program to create a arraylist of double element and add the elements.
//sort the elements in descending order and print it.

public class First {

	public static void main(String[] args) {
    ArrayList<Double> a1= new  ArrayList<Double>();
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the no of  elements");
    int n=sc.nextInt();
    System.out.println("enter the double elements");
    for(int i=0;i<n;i++) {
    	a1.add(sc.nextDouble());
    }
    System.out.println("The array list: "+a1);
    System.out.println("Elements in descending order");
    Collections.sort(a1,Collections.reverseOrder());
    for(Double value:a1)
	{
		System.out.println(value);
	} 
    

}}
