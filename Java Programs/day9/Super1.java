package day9;

 class Sample1{
	
	
		String color="white";
	}
	class Two extends Sample1
	{
		String color="brown";
		void printcolor()
		{
			System.out.println(color);//brown
			System.out.println(super.color);//white
		}
	
	
	}
	class Super1 {
	public static void main(String[] args) {
		Two obj1=new Two();
		obj1.printcolor();
	}

}
