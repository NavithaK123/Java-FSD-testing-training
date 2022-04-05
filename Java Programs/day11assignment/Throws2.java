package day11assignment;

import java.util.Scanner;

public class Throws2 {
	
	int num1,num2,result;
	Scanner sc=new Scanner(System.in);
    void division()throws ArithmeticException{
	System.out.println("enter numbers");
	num1=sc.nextInt();
	num2=sc.nextInt();
	result=num1/num2;
	System.out.println(result);
	
	
	
	
}
	public static void main(String[] args) {
try {
	Throws2 obj=new Throws2();
	obj.division();
}
catch(ArithmeticException e) {
	System.out.println(e);
	
	}
System.out.println("end of pgm");
	}

}
