package day18Assignment;

import java.util.Hashtable;
import java.util.Map;

public class HashTableA {

	public static void main(String[] args) {
		Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
		  
		  hm.put(100,"Parrot");  
		  hm.put(101,"Crow");  
		  hm.put(102,"Crane");  
		  hm.put(103,"Owl");  
		  System.out.println("Initial Map: "+hm);  
		  //Set<Map.Entry<K,V>> entrySet()
          for(Map.Entry m:hm.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
		}
		  // V getOrDefault(Object key, V defaultValue)
         System.out.println(hm.getOrDefault(101," ")); 
         //V put(K key, V value),//Returns the current value, as the specified pair already exist 
         hm.putIfAbsent(104,"Peacock");  
 	     System.out.println("Updated Map: "+hm); 
 	    hm.putIfAbsent(101,"eagle");  
	    System.out.println("Updated Map: "+hm);
         //remove

 	       hm.remove(102);  
	       System.out.println("After remove: "+hm); 
        //boolean contains(Object value)


          System.out.println(hm.contains("Crow"));
          System.out.println(hm.contains("Eagle"));
        //empty?
          boolean result1=hm.isEmpty();
          System.out.println(result1);
        //Replace the value at key 100
  	    hm.replace(100,"Hen");
  	    System.out.println("Updated Map: "+hm);
  	//Checking key in map and getting the value
	    if(hm.containsKey(101)==true) {
	    	System.out.println("Value of key 101 is "+hm.get(101));
	    }
	  //printing all values in map
	    System.out.println(hm.values());
	    //replace
	    if(hm.replace(103,"Owl","Pigeon")==true) {
	    	System.out.println("Replaced Pigeon");
	    	System.out.println("Updated Map: "+hm);
	    }
	    
	    
  	   //remove all mapping elements
        hm.clear();
        System.out.println("AFter clear method "+hm);

        boolean result2=hm.isEmpty();
        System.out.println(result2);
         


	}

}
