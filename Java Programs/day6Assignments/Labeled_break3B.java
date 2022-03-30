package day6Assignments;

public class Labeled_break3B {// 

	public static void main(String[] args) {
     a:
    	 for(int i=1;i<5;i++) {
    	b:	 
    	  for( int j=1;j<5;j++) {
    		  
    		 
    		 if(i==j) {
    			break b;
    			 
    		 }
    		 System.out.println(i+" "+j);
    		 
    	  }
    	  
    	  System.out.println("same row and column");
    	  
      }
	}

}
