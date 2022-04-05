package day11assignment;

public class Finally {

	public static void main(String[] args) {
		String s="Example One";
		try {
			
			System.out.println("length  of string:"+s.length());
			System.out.println("substring : "+s.substring(8));
			System.out.println("substring "+s.substring(15));
			}
	     catch(StringIndexOutOfBoundsException e){
	    	 
	    	 System.out.println(e);}
	    	 catch(Exception e) {
	    		 System.out.println(e);
	    	 }
	     
			try {
			
			System.out.println(s.charAt(15));
			}
			
			catch(StringIndexOutOfBoundsException e){
				System.out.println( e);
			}
			catch(Exception e) {
	   		 System.out.println(e);
	   	 }
		finally	{
			System.out.println(" Finally block is always executed");
		}
			
			
			
			System.out.println("end of code");
	}

}
