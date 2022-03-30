package day2;

import java.util.Scanner;

public class CompoundStatement {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the 2 numbers");
    double a=sc.nextDouble();
    double b=sc.nextDouble();
    a+=b;
    System.out.println("Addition "+a );
    a-=b;
    System.out.println("subtraction "+a );
    a*=b;
    System.out.println("multipication "+a );
    a/=b;
    System.out.println("division "+a );
    a%=b;
    System.out.println("remainder "+a );
    
    
	}

}
