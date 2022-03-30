package day6;

public class BreakExample2 {

	public static void main(String[] args) {
		
		for(int i=1;i<=3;i++) {//outer loop
			
			for( int j=1;j<=3;j++) {//inner
				if(i==2&&j==2) {//if i=j=2,break from inner  loop and goes to outer increment i value as3
					
					break;
				}
				System.out.println(i+","+j);
			}
		}
   
	}

}
