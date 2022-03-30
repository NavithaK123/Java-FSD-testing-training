package day4noonassignment;

class Animal{
	void cry1() {
		System.out.println(" i am animal");
	}
	}

class Dog extends Animal{
	void dogcry() {
		System.out.println(" i am dog");
	}
	
}


class Cat extends Animal{
	void catcry() {
		System.out.println(" i am cat");
	}
}

class Cow extends Animal{
	void cowcry() {
	System.out.println(" i am cow");
}

}


public class Hierarchical {

	public static void main(String[] args) {
	Dog d=new Dog();
	Cat ca=new Cat();
	Cow co=new Cow();
	co.cowcry();	
    co.cry1();
	d.dogcry();
	d.cry1();
	}

}
