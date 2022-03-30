package day3assignment;

import java.util.Scanner;

public class SecondA {//find gratest of 3

	public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    int e;
    System.out.println("enter the 3 numbers"); 
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int d=(a>=b)?a:b;//e=(a>b)?(a>c ?a:c);(b>c?b:c);
    e=(d>=c)?d:c;
    System.out.println(e+ "is greater");
    
    
    
	}

}
