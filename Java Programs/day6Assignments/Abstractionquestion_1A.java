package day6Assignments;

abstract class Bird{
	
	Bird(){
	System.out.println("bird class invoked");	
		}
  
void cry() {//Non abstract method
	System.out.println(" bird is crying-non abtrsct method");
}
 abstract void color();//abstract methods
abstract void NumberOfBirds();


}
 class Parrot extends Bird {
	 void color() {
	System.out.println("green   -implementation of abstract method1");}
		void NumberOfBirds() {
		System.out.println("100 --implementation of abstract method2");	
		}	
 }
public class Abstractionquestion_1A {

	public static void main(String[] args) {
    Bird obj=new Parrot();
    obj.color();
    obj.cry();
    obj.NumberOfBirds();
	}
	
}

