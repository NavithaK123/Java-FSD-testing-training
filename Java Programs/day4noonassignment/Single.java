package day4noonassignment;

class Parent{
	void show1() {
		System.out.println(" i am parent");//single child of parent
	}
	}
class 	Child extends Parent{
	void show2() {
		System.out.println(" i am child");
	}
}
	
	public class Single {
	public static void main(String[] args) {
    Child obj= new Child();
    obj.show1();
    obj.show2();
    
    
    	
	}

}
