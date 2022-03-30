package day3assignment;

import java.util.Scanner;



public class First {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in ); 
	    System.out.println("Enter the first number");
	    
	     int num1= sc.nextInt();
	     
	     System.out.println("Enter the second number");
	     
	     int num2= sc.nextInt();
	     
	     int sum=num1+num2;
	     int sub=num1-num2;
	     int product=num1*num2;
	     int division=num1/num2;
	     int remainder=num1%num2;
	    
	     System.out.println("Output for addition :" +sum);
	     System.out.println("Output for subtraction :" +sub);
	     System.out.println("Output for multipication :"+product ); 
	     System.out.println("Output for division:" +division);
	     System.out.println("Remainder of the  2 numbers  :" +remainder);
	     
		}

	

	}


