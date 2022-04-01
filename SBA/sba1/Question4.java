package sba1;
//Write a program to check for the occurrence of a particular character in a string and display how many times it has occurred.
//note: take the String  and the character to be checked as a input from the user.

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		int count=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string ");
    String s=sc.next();
    System.out.println("enter the character to find occurence");
    char s2=sc.next().charAt(0);
    for( int i=0;i<s.length();i++) {
    	if(s.charAt(i)==s2) {
    		
    		count++;
    		
    }
    	}
    System.out.println("occurance of "   +s2+" in the string  " +s+ "=" +count);
}}



