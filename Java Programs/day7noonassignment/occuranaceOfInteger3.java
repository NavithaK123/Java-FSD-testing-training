package day7noonassignment;
//Write a program to input an array of integers according to the user , and also take a input of a 
//particular integer and find out the occurence of the intger in the array.

import java.util.Scanner;

public class occuranaceOfInteger3 {

	public static void main(String[] args) {
		int count =0;
		System.out.println("enter the size of array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("enter the elements");
		int []arr1=new int[size];
		for( int i=0;i<size;i++) {
			arr1[i]=sc.nextInt();
			}
		System.out.println("enter the elemnt to find the no of occurence");
		int number=sc.nextInt();
		for( int i=0;i<size;i++) {
			if (arr1[i]==number) {
				count++;
			}
			
		}
		System.out.println("no of occurence  :"+count);
	}

}
