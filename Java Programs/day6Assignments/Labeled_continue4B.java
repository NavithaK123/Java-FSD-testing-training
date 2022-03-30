package day6Assignments;

public class Labeled_continue4B {

	public static void main(String[] args) {
		a:  
            for(int i=1;i<=5;i++){   //print dissimilar row and column
                    b:  
                    for(int j=1;j<=5;j++){ 
                        if(i==j){   
                            continue a;    
                        }    
                        System.out.println(i+", "+j);    
                    }    
            }  
	}

}
	


