package day10aassignment;
// Write a program to implement nested try-catch block for NUll Pointer exception
//and NumberFormat Exception.

public class ExampleQ1 {

	public static void main(String[] args) {
		
		String s=null;
		try {
	System.out.println("outer try starts");
	try {
	System.out.println("inner try starts");
	
	System.out.println(s.length());
	}
catch(Exception e){
	
	System.out.println(e);
	System.out.println("inner try ends");
}
	int a=Integer.parseInt("3j");
	System.out.println(a);
	
	
}
	catch(Exception e){
	System.out.println(e);
	System.out.println("outer try closes");
	}

}
}