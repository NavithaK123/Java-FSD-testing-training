package day8assignment;
//Write a program to take input of a String and convert it into a character array and reverse the array,
//and to again make that reversed character array as a String and display it.

import java.util.Scanner;

public class Ques3 {

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		    System.out.println("enter the string ");
		    String s=sc.next();
		    
		    char []c=new char[s.length()];
		    
		    for( int i=0;i<s.length();i++) {
		    c[i]=s.charAt(i);	 
	}
		   
System.out.println("the character array ");
for( int i=0;i<s.length();i++) {
System.out.println(c[i]);
}
System.out.println("reverse array");
for( int i=s.length()-1;i>=0;i--) {
System.out.println(c[i]);

}
System.out.println("reverse array onto string");
for( int i=s.length()-1;i>=0;i--) {
String s2=String.valueOf(c[i]);
	
	System.out.print(s2);
	
}
}
}