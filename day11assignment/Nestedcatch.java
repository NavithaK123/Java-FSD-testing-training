package day11assignment;

public class Nestedcatch {

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
	


