package day8assignment;

import java.util.Scanner;

/*Write a program to take an input of a string with multiple words and convert it into a string array,
//and check if every element of that array is a Palindrome.
Note: Palindrome is a word which when reveresed also is the same.
example:-
MOM*/
public class Ques5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter the string ");
	    String str=sc.nextLine();
	    String strArray[]=str.split(" ");
	    
	    System.out.println("String : "+str);
	    System.out.print("String array:[");
	    for(int i=0;i<strArray.length;i++) {
	    	System.out.print(strArray[i]+", ");
	    }
	    System.out.print(" ]"+"\n");
	    String word;
	    for(int i=0;i<strArray.length;i++)
	    {
	    word=strArray[i];
	    char[] str1=new char[word.length()];
	    int count =0;
	    for(int j=word.length()-1;j>=0;j--) {
	    	str1[count]=word.charAt(j);
	    	count++;
	    }
	    String word2=new String(str1);	
	    if(word.equals(word2)) {
	    System.out.println("Palindrome word: "+word);
	    
	    
	    
	    }
	    
	}

}}
