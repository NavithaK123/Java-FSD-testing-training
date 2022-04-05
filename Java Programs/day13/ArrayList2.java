package day13;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayList2 {

	public static void main(String[] args) {
    ArrayList<String>sample=new  ArrayList<String>();
    sample.add("honda");
    sample.add("maruthi");
    sample.add("ferari");
    sample.add("toyota");
    System.out.println(sample);
  
    Iterator itr=sample.iterator();
    while(itr.hasNext()) {
    	System.out.println(itr.next());
    }
    
    
	}

}