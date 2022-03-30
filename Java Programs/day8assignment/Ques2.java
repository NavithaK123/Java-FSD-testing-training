package day8assignment;

import java.util.Scanner;

//.Write a program to take input of a String and also take in a number of characters as the
//user wishes and check if they are present in the String.
public class Ques2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter the string ");
	    String s=sc.next();
	    int count =0;
	    System.out.println("enter the number os chracters");
	    int n=sc.nextInt();
	    System.out.println("enter the characters to check ");
	    
	    char a[]=new char[n];
	    for(int i=0;i<n;i++) {
	    	a[i]=sc.next().charAt(0);
	    }
	    System.out.println("entered characters are");
	    for(int i=0;i<n;i++) {
	    	System.out.println(a[i]+",");
	    }
	    for( int i=0;i<s.length();i++) {
	    char ch=s.charAt(i);
	    for( int j=0;j<n;j++) {
	    	if(a[j]==ch){
	    		System.out.println("character " +a[j]+" present");
	    		count++;
	    	}
	    		
	    	}
	    	
	    		}
	    if(count==0)
	    	System.out.println("not present");
	    }	    
	    }