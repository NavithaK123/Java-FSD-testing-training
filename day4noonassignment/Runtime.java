package day4noonassignment;
class A1{
void method() {//overriding
			System.out.println(" i am parent");
	}}
class B1 extends A1 {
	
	
	void method() {
	System.out.println(" i am child");
}
}

class C1 extends B1{
	void method() {
		System.out.println(" i am grant child");
	}
}

public class Runtime {

	public static void main(String[] args) {
	 A1 obj =null;	
    obj=new A1();
     obj.method();
     obj=new B1();
     obj.method();
     obj =new C1();
     obj.method();
     
     
	}

}

