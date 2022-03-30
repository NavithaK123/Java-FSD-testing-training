package day7noonassignment;

import java.util.Scanner;

//Write a program to input the following details:
//i)Employee Name ii)Employee Salary iii)Employee Year of joining
public class Employeedeatails5 {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the no of employess");
     int size=sc.nextInt();
     System.out.println("Enter the employee name");
     String [] arr1=new String[size];
     for(int i=0;i<size;i++) {
    	 arr1[i]=sc.next();
    	 
     }
     System.out.println("Enter the salary");
     
     double [] arr2=new double[size];
     
     for(int i=0;i<size;i++) {
    	 arr2[i]=sc.nextDouble();
    	 
     }
     System.out.println("Enter the year of joining");
     int[] arr3= new int[size];
     for(int i=0;i<size;i++) {
    	 arr3[i]=sc.nextInt();
    	 
     }
     
     for(int i=0;i<size;i++) {
     
     System.out.println("Name : "+arr1[i]+","+"salary :  "+arr2[i]+","+"joing date  :  "+arr3[i]);
     }
	}

}
