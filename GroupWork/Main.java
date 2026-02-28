package GroupWork;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		ArrayList<Box<String>> names = new ArrayList<>();
		ArrayList<Box<Integer>> ids = new ArrayList<>();		
		
	      Box<String> a = new Box<>("value");	
	    
	      
	      
	      Box<String> b = new Box<>("tasnim");
	      Box<String> a0 = new Box<>("lebron");	
	      Box<String> a90 = new Box<>("jordan");	
	      Box<Integer> a1 = new Box<>(90); Box<Integer> a2 = new Box<>(28);
	      Box<Integer> a3 = new Box<>(87);Box<Integer> a4 = new Box<>(100);
	      names.add(a);names.add(b);names.add(a0);names.add(a90);names.add(a);
	      ids.add(a1); ids.add(a2); ids.add(a3); ids.add(a4);
	      Iterator<Box<String>> it = names.iterator();
	      
	      while(it.hasNext()) {
	    	  Box<String> element = it.next();
	    	  System.out.println(element.getValue());
	      }
	      
	      Iterator<Box<Integer>> ite = ids.iterator();
	      
	      while(ite.hasNext()) {
	    	  Box<Integer> element = ite.next();
	    	  System.out.println(element.getValue());
	      }
	         //1. box<t> allows for multiple data types to be used, without it you need to manually use data types which may take longer 
	      //2. no casting needed for iterators bc you can use generics which comes with inbuilt data for your object in main
	      //3. ArrayList requires a generic type to be built when creating it which can be one of the relation
	
	      
	
		
		
		
		
	}

}
