package sba4;
//Write a program to implement Hashtable and add atleast 4 values into it, implement the putIfAbsent() method.

import java.util.Hashtable;

public class Ques3 {

	public static void main(String[] args) {
		Hashtable<Integer,String> map=new Hashtable<Integer,String>();        
	    map.put(100,"Amit");    
	    map.put(102,"Ravi");   
	    map.put(101,"Vijay");    
	    map.put(103,"Rahul");    
	    System.out.println("Before remove: "+ map);   
	    // Remove value for key 102  
	    map.remove(102);  
	    System.out.println("After remove: "+ map);  
	    //checking empty or not
	    System.out.println("map is empty? "+map.isEmpty());
	    //Here, we specify the if and else statement as arguments of the method  
	    System.out.println(map.getOrDefault(101, "Not Found"));  
	    System.out.println(map.getOrDefault(105, "Not Found")); 
	    //Inserts, as the specified pair is unique  
	    map.putIfAbsent(102,"Gaurav");  
	    System.out.println("Updated Map: "+map);  
	    //Returns the current value, as the specified pair already exist  
	    map.putIfAbsent(101,"Dhamu");  
	    System.out.println("Updated Map: "+map);
	    //Replace the value at key 100
	    map.replace(100,"Kelu");
	    System.out.println("Updated Map: "+map);
	    //Checking values in map
	    System.out.println("Dhamu in map? "+map.contains("Dhamu"));
	    System.out.println("Kelu in map? "+map.contains("Kelu"));
	    //Checking key in map and getting the value
	    if(map.containsKey(101)==true) {
	    	System.out.println("Vlaue of key 101 is "+map.get(101));
	    }
	    //printing all values in map
	    System.out.println(map.values());
	    if(map.replace(103,"rahul","Raju")==true) {
	    	System.out.println("Replaced Rahul...");
	    	System.out.println("Updated Map: "+map);
	    }
	    
	}       

}
