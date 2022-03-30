package day7noonassignment;

import java.util.Scanner;

//Write a program to input a String array and display it, and now to copy the elements into
//another array in the reverse order and print the reverse_array elements.

public class ReverseArray4 {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of array");
    int size=sc.nextInt();
    System.out.println("give the string elements");
    String[] arr=new String[size];
    for( int i=0;i<size;i++) {
    	arr[i]=sc.next();
    }
    System.out.println(" the array is");
    for( int i=0;i<size;i++) {
    System.out.println(arr[i]);
    }
    System.out.println("reversed array");
    
    for(int i=size-1;i>=0;i--) {
    	System.out.println(arr[i]+" ");
    }
    
    
    

}
}