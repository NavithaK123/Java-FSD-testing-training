package day1;

import java.util.Scanner;

public class SumBasics {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the 3 numbers");
    
    double a,b,c,d;
    a=sc.nextDouble();
   
    b=sc.nextDouble();
   
    c=sc.nextDouble();
    d=a+b+c;
    System.out.println("Sum of three numbers="+d);
    
	}

}
