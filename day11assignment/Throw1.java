package day11assignment;

import java.util.Scanner;

public class Throw1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		System.out.println("enter the weight");
	double  weight=sc.nextDouble();
		
    if(age<12 && weight<40) {
        throw new ArithmeticException("Student is not eligible for registration"); 
     }
     else {
        System.out.println("Student Entry is Valid!!"); 
     }
    
  System.out.println("Welcome to the Registration process!!");
  
		  
		
	}}


