package day4;

 class Animal{
	void eat() {
		System.out.println("eating");
	}
}
   class Dog extends Animal {
	   
	 void bark() {
		 System.out.println("barking");
	 }
	  	
}
class Puppy extends Dog{
	void sleeping() {
		System.out.println("Sleeping");
	}
}
public class ClassDemo {

	public static void main(String[] args) {
		
Puppy d=new Puppy();

d.bark();
d.eat();
d.sleeping();
	}
	

}
