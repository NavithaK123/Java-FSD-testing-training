package day6;

public class Breakexample3 {

	public static void main(String[] args) {
	       aa:  //outer
	            for(int i=1;i<=3;i++){    
	                    bb:  //inner
	                    for(int j=1;j<=3;j++){    
	                        if(i==2&&j==2){    
	                            break aa;  //labeled ,so break from  entire outer loop not from inner loop only 
	                        }    
	                        System.out.println(i+" ,"+j);    
	                    }    
	            }    
	            System.out.println("End of the program");
	}  
	
	}


