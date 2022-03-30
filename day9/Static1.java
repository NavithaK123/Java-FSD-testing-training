package day9;

public class Static1 {
	static int count=0; // a.count, b.count, c.count
	void static1()
	{
		count++;
		System.out.println(count);
	}
	
	
	

	public static void main(String[] args) {
		Static1 a=new Static1();
		Static1 b=new Static1();
		Static1 c=new Static1();	
	}

}
