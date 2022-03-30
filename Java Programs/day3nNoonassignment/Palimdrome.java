package day3nNoonassignment;

import java.util.Scanner;

public class Palimdrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number");
	    int n=sc.nextInt();
	    int number=n;
	    int rev=0;
	    while(n!=0) {
	    	rev=rev*10+n%10;
	    	n=n/10;
	    }
	    
	    System.out.println(rev);
	    if(number==rev) {
	    	System.out.println("Palindrome");
	    }
	    else
	    	System.out.println("Not palindrome");
	    
	}

}
