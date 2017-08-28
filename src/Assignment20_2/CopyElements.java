package Assignment20_2;

import java.util.HashSet;
import java.util.Set;
/**
 * 
 * @author Vishwas
 * in here creating a class name ComyElements this class will..
 * copy all the elements from set2 to set1 and then..
 * set1 becomes the union of set1 and set2.
 *
 */
public class CopyElements {
	// main method
	public static void main(String args[]) {		
        /**
         * in here creating an object of set(set1) 
         * and adding some elements(mobile brands) it.
         */
        Set<String> set1 = new HashSet<String>();
        set1.add("MI");
        set1.add("Samsung");
        set1.add("Apple");
        set1.add("Oppo");
        set1.add("Vivo");
        
        /**
         * in here creating an another object of set(set2) 
         * and adding some elements(laptops brands) it.
         */
        Set<String> set2 = new HashSet<String>();
        set2.add("Acer");
        set2.add("Lenovo");
        set2.add("Asus");
        set2.add("Mac");
        set2.add("HP");
      
        // window console for set1
       System.out.println("Set1 Mobiles :" + set1);
       	// window console for set2
       System.out.println("Set2 Laptops:" + set2);
       
       /**
        * coped all the elements from set2 to set1..
        * and printing the union of set1 and set2.
        */
       set1.addAll(set2);
       System.out.println("\nProducts:" + set1);
        
      


}
}
