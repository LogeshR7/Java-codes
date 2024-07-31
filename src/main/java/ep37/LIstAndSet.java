package ep37;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LIstAndSet {                                      //List fllowes order
	                                                           //list allows duplicate
	public static void main(String[] args) {
		List<String>fruit=new ArrayList<String>();
		fruit.add("apple");
		fruit.add("pine");
		fruit.add("orange");
		fruit.add("mango");
		fruit.add("chicku");
		fruit.add("apple");
		Collections.sort(fruit);
		
		
		//Size
		int size=fruit.size();
		System.out.println(size);
		
		//Remove
		boolean delete=fruit.remove("apple");
		System.out.println(delete);
		
		//Isempty
		boolean empty=fruit.isEmpty();
		System.out.println(empty);
		
		//Contains
		boolean erukaillaya=fruit.contains("apple");
		System.out.println(erukaillaya);
		
		//get
		String get= fruit.get(0);
		System.out.println(get);
		
		//clear
	    fruit.clear();
		
		
		
	}

}
