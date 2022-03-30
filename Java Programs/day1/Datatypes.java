package day1;

public class Datatypes {

	static int instance_example=14;//instance variable global variable
	public static void main(String[] args)
	{
		int a=25;
		double b=3.2225;
		char c='z';
		boolean temp=true;
		String s="Example";
		sample();
		System.out.println(a);
		System.out.println(instance_example);//
	}
	public static void sample()
	{
		System.out.println(instance_example);//global variable can acces any where inside a class
	   // System.out.printlna(a);local variable cannot acces outside main method
	}
	 
}
/* 10- int, long, short, byte
	45.876-Decimal points- double,float 
	't'- char
	true/false- boolean
	"My laptop"- String( Non- primitive)

	Syntax:
	datatype identifier/variable_name = value; initialise a variable
	datatype identifier/variable_name; */
