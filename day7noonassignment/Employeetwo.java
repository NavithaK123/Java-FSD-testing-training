package day7noonassignment;
////Write a program to input the following details:
//i)Employee Name ii)Employee Salary iii)Employee Year of joining
import java.util.Scanner;

public class Employeetwo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	     System.out.println("enter the no of employess");
	     int size=sc.nextInt();
	     
	     System.out.println("enter the name salary and joing year");
	     
	     String[]name=new String[size];
	     double[] salary=new double [size];
	     int []year=new int[size];
	     for(int i=0;i<size;i++) {
	     name[i]=sc.next();
	     salary[i]=sc.nextDouble();
	     year[i]=sc.nextInt();
	}
   System.out.println("details are");
   for(int i=0;i<size;i++) {
	   System.out.println("Name:  "+name[i]+", salary :"+salary[i]+" ,Year of joining :"+year[i]);
	     
}}
}