package day19;
import java.util.*;
public class LinkedHashSetCollectionExmp {

	public static void main(String[] args) {
		LinkedHashSet<String> set=new LinkedHashSet<String>();  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");
		set.add("Anu");
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}

}
