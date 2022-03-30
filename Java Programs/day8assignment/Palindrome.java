package day8assignment;

import java.util.Scanner;

/*Write a program to take an input of a string with multiple words and convert it into a string array,
//and check if every element of that array is a Palindrome.
Note: Palindrome is a word which when reveresed also is the same.
example:-
MOM*/
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter the string ");
	    String s=sc.next();
	    int length=s.length();
	    String rev="";
	    for (int i=length-1;i>=0;i--)
	    rev=rev+s.charAt(i);
	    if(s.equals(rev))
	    	System.out.println(s+" palindrome");
	    else
	    	System.out.println(s+" not palindrome");
	}

}
