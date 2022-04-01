package com.lti.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex_Map2 {
	public static void main(String[] args) {
		
		//way2 :
		//Iterating over keys or values using keySet() and values() methods
		
		//Map.keySet() method returns a Set view of the keys 
		// Map.values() method returns a collection-view of the values 
		
		HashMap<Integer, Product> prdMap= new HashMap<>();	
		
		prdMap.put(101, new Product( 101, "TShirt", 1_200, 5 ));
		prdMap.put(102, new Product( 102, "Saree", 3_0000, 3 ));
		prdMap.put(103, new Product( 103, "abcd", 4_0000, 4 ));
		
		
		
		 System.out.println("\n using keySet values");
		// using keySet() for iteration over keys 
        for (Integer I : prdMap.keySet())  
            System.out.println("key: " + I ); 
          
        // using values() for iteration over keys 
        for (Product p : prdMap.values())  
            System.out.println("value: " + p); 
        
        prdMap.forEach((k,v) -> System.out.println("Key = " + k + ", Value = " + v)); 
    	
        
        //way3 : 
        // using iterators 
        
       // Using iterators 
        //- advantage is  we can remove entries from the map during iteration 
        System.out.println("\n using Iterator");
        
        Iterator <Map.Entry<Integer, Product>> itr = prdMap.entrySet().iterator(); 
        
        while(itr.hasNext()) 
        { 
             Map.Entry<Integer, Product> entry = itr.next();   
             
             System.out.println("Key = " + entry.getKey() +  
                                 ", Value = " + entry.getValue()); 
            
        } 
        System.out.println("\n using Lambda");
        
        //way4 :Lambda 
        prdMap.forEach((k,v) -> System.out.println("Key = " + k + ", Value = " + v)); 
	
	
	//way 5: inefficient 
	//Iterating over keys and searching for values (inefficient)
	System.out.println("\n through each key and searching for value....so slow  ");
	for (Integer I : prdMap.keySet())  
    { 
        // search  for value 
        Product p = prdMap.get(I); 
        System.out.println("Key = " + I+ ", Value = " + p); 
    } 

}
}


//Collection<Product> values = products.values();	

/*Iterator<Integer> it = s.iterator();

while(it.hasNext())
{
	Integer key = it.next();
	
	Product product = products.get( key );
	
	System.out.println( product );
}
*/
/*
Set s1 = products.entrySet();

Iterator it = s1.iterator();

while(it.hasNext())
	
	System.out.println(it.next());
		

//System.out.println(keys);
//System.out.println(values);

//System.out.println("\n" + keyValuePair); */