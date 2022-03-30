package day4noonassignment;
 
class One {
	void add(int a,int b) {
	int	s=a+b;
	System.out.println(s);
	}
}

class Two extends One{
	void add(int a,int b,int c ) {
		int s=a+b+c;
		System.out.println(s);
		
	}
}

class Three extends Two{
	void add(int a,int b,int c,int d) {
		int s=a+b+c+d;
		System.out.println(s);
	}
}

public class Overloading_numberOf_Arguments {

	public static void main(String[] args) {
		
		Three obj=new Three();
       obj.add(25,5);
       obj.add(5, 2, 10);
       obj.add(2, 4, 6, 8);
	}

}
