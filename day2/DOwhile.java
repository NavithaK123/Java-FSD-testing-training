package day2;

import java.util.Scanner;

public class DOwhile {

	public static void main(String[] args) {
    //to print 1-10
	int i=0;	
	do {
	System.out.println(i);
	i++;
	}
	 while(i<=10) ; 
	   
	 //to print 1to n  
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the n value");
	  int n=sc.nextInt();
	   i=1;
	   do {
		   System.out.println(i);
		   i++;}
		 while (i<=n) ;
	  //to print 10 to 1 
	   i=10;
	  do {
		  System.out.println(i);
		  i--;
	  }
   while(i>=1);
    
    //to print n to 1
	  System.out.println("enter number");
    n=sc.nextInt();
    do {
    	System.out.println(n);
    	n--;}
    while(n>=1);
    

}}