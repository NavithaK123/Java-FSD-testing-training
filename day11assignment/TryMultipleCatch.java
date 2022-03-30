package day11assignment;

public class TryMultipleCatch {

	public static void main(String[] args) {
     try {
    	 int a=args.length;
    	 System.out.println("a="+a);
    	 int b=42/a;
    	 int c[]= {1};
    	System.out.println(c[42]);
     }
     catch(ArithmeticException e) {
    	 System.out.println("divide by 0 "+e);
     }
     catch(ArrayIndexOutOfBoundsException e) {
    	System.out.println(e); 
    	 }
     System.out.println("end of code");
	}

}
