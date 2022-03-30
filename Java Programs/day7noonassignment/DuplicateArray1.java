package day7noonassignment;

import java.util.Scanner;

//Write a program to input an array of integers according to the users, and display the duplicate array elements.
public class DuplicateArray1 {

	public static void main(String[] args) {
System.out.println("enter the size of array");
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
System.out.println("enter the elements");
int []arr1=new int[size];
for( int i=0;i<size;i++) {
	arr1[i]=sc.nextInt();
	}
for (int i=0;i<size;i++) {
	
	for ( int j=i+1;j<size;j++) {
	
	if (arr1[i]==arr1[j]) {
		
		System.out.println("duplicate element:");
		System.out.println(arr1[i]);
		
	}
	
	}
}


	
	
	
}


}



	


