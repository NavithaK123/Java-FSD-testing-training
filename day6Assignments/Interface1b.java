package day6Assignments;
interface Umbrella{
 void brand();
  void cost();
}
class Popy implements Umbrella{
	
public 	void brand() {
		System.out.println(" this is popy");
	}
public	void cost() {
	System.out.println(" low cost");
}
}
class Jhonson implements Umbrella{
	public void brand() {
		System.out.println(" this is jhonson");
	}
		public	void cost() {
			System.out.println(" high cost");	
		
	}
}

public class Interface1b {

	public static void main(String[] args) {
    Umbrella um=null;
    um=new Popy();
    um.brand();
    um.cost();
    um=new Jhonson();
    um.brand();
    um.cost();
	}

}
