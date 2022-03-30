package day4noonassignment;

class Sample1 {
	void add(int a,int b) {
	int	s=a+b;
	System.out.println(s+" from sample1");
	}
}

class Sample2 extends Sample1 {
	void add(int a,double b ) {
		double s=a+b;
		System.out.println(s+"from sample2");
		
	}
}

class Sample3 extends Sample2{
	void add(double b,double c) {
		double  s=b+c;
		System.out.println(s+" sample3");
	}
}

class Overloading_type_arguments {

	public static void main(String[] args) {
		Sample3 obj=new Sample3();
  
  obj.add(5,12);
  obj.add(2, 52.23);
  obj.add(52.33,25.3);
	}

}
