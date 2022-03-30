package day2;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 2 numbers");
    double c;
    int a=sc.nextInt();
    int b= sc.nextInt();
    c=a+b;
    System.out.println("sum="+c);
    c=a-b;
    System.out.println("sub"+c);
    c=a*b;
    System.out.println("product"+c);
    c=a%b;
    System.out.println("rem:"+c);
    
	}

}
