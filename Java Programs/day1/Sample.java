package day1;

import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
	double a,b,c,avg;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the 3 double values");
    a=sc.nextDouble();
    b=sc.nextDouble();
    c=sc.nextDouble();
   
    avg=(a+b+c)/3;
    
    System.out.println("Average of 3 numbers = "+avg);
	}

}
