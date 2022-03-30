package day2;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {// 1 to 10
		int i;
     for(i=1;i<=10;i++) {
    	System.out.println(i); 
    	  }
    // 1 to n
     Scanner sc=new Scanner(System.in);
     System.out.println("enter n value");
     int n=sc.nextInt();
     
     for(i=1;i<=n;i++) {
    	 
    	 System.out.println(i);
     }
     //n to 1
     System.out.println("enter n");
      n=sc.nextInt();
     for( i=n;i>=1;i--){
     System.out.println(i);
	}

}}
