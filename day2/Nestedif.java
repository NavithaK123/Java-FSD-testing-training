package day2;

import java.util.Scanner;

public class Nestedif {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the age");
    int age=sc.nextInt();
    
    
    if(age>=18) {
    	System.out.println("Enter the weight");
        double weight=sc.nextDouble();                        //nested if,"if "conditions inside one "if" condition
    	if(weight>50) {
    		System.out.println("Eligible to donate blood");
    	}
    	else {
    	System.out.println("Not eligible");
    	
    }
    
	}
    else {
    	System.out.println("Age must greter than 18");
    }
}}
