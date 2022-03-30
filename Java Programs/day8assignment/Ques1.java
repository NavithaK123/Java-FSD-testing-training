package day8assignment;
import java.lang.*;
import java.util.Scanner;

//Write a program to take take two strings as an input from the user and check
//if the second one is a substring of the first.

public class Ques1 {

	public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the first word");
  String s1=sc.next();
  System.out.println("enter the second");
  String s2=sc.next();
boolean result=false;
	result=s1.contains(s2);
	System.out.println(result);
	}}