package day10aassignment;
//Write a program to implement try catch block for String Index Out of Bounds



public class ExampleQ2 {
	
	public static void main(String[] args) {
		
		String s="Example one";
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
		System.out.println("end of code");
	}

}
