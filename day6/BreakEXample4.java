package day6;

public class BreakEXample4 {

	public static void main(String[] args) {
		outer:
			for(int i=0;i<3;i++)
			{
				inner:
				for(int j=0;j<3;j++)
				{
					System.out.println(i+","+j);
					if(j==2)
						break inner;
					if(i==j)
						continue outer;//going to loop
					System.out.println("Bye");
				}
				System.out.println("ENd of iteration:"+i);
			}
		}
	}
	


