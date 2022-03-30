package day9;


	class Example
	{
		final void test()
		{
			System.out.println("test method in Example class");
		}
	}
	class FinalExmp2 extends Example
	{
		//void test()
		{
			System.out.println("test method in FinalExmp2 class");
		}
	public static void main(String[] args) {
		FinalExmp2 obj=new FinalExmp2();
		obj.test();

	}

}
