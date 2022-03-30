package day1;
import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		double a,b,c,d;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 3 numbers");
    a=sc.nextDouble();
    b=sc.nextDouble();
    c=sc.nextDouble();
    d=(a*b*c)/3;
    System.out.println(d);
	}

}
