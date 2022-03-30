package day4noonassignment;
//multilevel inheritence
class A{
void method1() {
			System.out.println(" i am parent");
	}}
class B extends A {
	
	
	void method2() {
	System.out.println(" i am child");
}
}

class C extends B{
	void method3() {
		System.out.println(" i am grant child");
	}
}

public class Multilevel {

	public static void main(String[] args) {
    C object =new C();
    object.method1();
    object.method2();
    object.method3();
	}

}
