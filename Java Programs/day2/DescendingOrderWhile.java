package day2;

import java.util.Scanner;

public class DescendingOrderWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		
    int n=sc.nextInt();
    while(n>=1) {
    	System.out.println(n);
    	n--;
    }
	}

}
