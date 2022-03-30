package day7noonassignment;

import java.util.Scanner;

//Write a program to input an array of integers according to the users, and find the greatest value of them.
public class Greatest2 {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size");
    int size=sc.nextInt();
    int [] arr=new int[size];
    System.out.println("enter the elements");
    for(int i=0;i<size;i++) {
    	
    	arr[i]=sc.nextInt();
    }
    int max=arr[0];
    
    for (int i=0;i<size;i++) {
    	if(arr[i]>arr[0]) {
    		max=arr[i];
    	}
    	
    	
    	
    }
    System.out.println("gratest elememt is "+max);
    
	}

}
