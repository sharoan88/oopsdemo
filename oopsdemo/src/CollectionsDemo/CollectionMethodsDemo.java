package CollectionsDemo;
/*
 * Collections is an utility class in java.util package. 
It consists of only static methods which are used to operate on objects 
of type Collection. 
 */

import java.util.ArrayList;
import java.util.Collections;

public class CollectionMethodsDemo {
	
	public static void main(String[] args) {
		
		//create list of Strings
		ArrayList<String> a1 = new ArrayList<String>(5);
		
		a1.add("Java For Developers");
	    a1.add("Friends");
	    a1.add("Dear");
	    a1.add("Is");
	    a1.add("Superb");
	    
	    Collections.sort(a1);
        
	     // Let us print the sorted list
	        System.out.println("List after the use of" +
	                           " Collection.sort() :\n" + a1);
	    int pos=Collections.binarySearch(a1,"Superb");
	    System.out.println("The position of \"Superb\" in Arraylist is :"+pos);
	    
	     Collections.reverse(a1);
	    System.out.println("List after the Reversing"+ a1);

	     Collections.swap(a1,4,1);
	    System.out.println("List after the SWaping"+ a1);
	    
	    Collections.shuffle(a1);
	    System.out.println("List after the Shuffle"+ a1);
	    
	    ArrayList<String> n=new ArrayList<String>(5);
	    n.add("Java");
	    n.add("Fri");
	    n.add("De");
	    n.add("Ist");
	    n.add("Sup");

	    System.out.println(n);

	    Collections.copy(n, a1);

	    System.out.println("The new ArrayList Contents:"+n);

	    n=a1;
	    System.out.println("The new ArrayList Contents:"+n);
	    
	    ArrayList<String> n1=new ArrayList<String>(5);
	    n1.addAll(a1);
	    System.out.println(n1);
	    
	    ArrayList<String> n2=new ArrayList<String>(5);
	     n2= (ArrayList<String>) a1.clone();
	     System.out.println(n2);
	}
    
    
}
