package day2;

import java.util.Scanner;

public class Whileloop1Ascending {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n= sc.nextInt();
    int i=1;
    while(i<=n) {
    System.out.println(i);	
    i++; 
    }
	}

}
