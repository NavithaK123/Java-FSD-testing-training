package day9;
class Ani
{
	Ani()
	{
		System.out.println("animal class constructor is called");
	}
}
class SuperExmp3 extends Ani
{
	SuperExmp3()
	{
		super();
		System.out.println("sub class constructor is called");
	}}
public class Super3 {

	public static void main(String[] args) {
		SuperExmp3 a=new SuperExmp3();
	}

}
