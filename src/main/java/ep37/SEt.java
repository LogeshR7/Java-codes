package ep37;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SEt {
	public static void main(String[] args) {                         //Set doesnot allow duplicate
		Set<String>mobiles=new TreeSet<String>();                    //set doesnot fllow order
		mobiles.add("oneplus");                                      //Set has three types mainly
		mobiles.add("apple");                                        //Treeset //HashSet //LinkedHashset
		mobiles.add("samusang");
		mobiles.add("bermuda");
		mobiles.add("Nubia");
		mobiles.add("apple");
		
		
		//size
		System.out.println(mobiles.size());
		
		//Remove
		System.out.println(mobiles.remove("Nubia"));
		
		//isEmpty
		System.out.println(mobiles.isEmpty());
		
		//contains
		System.out.println(mobiles.contains("apple"));
		
		
		List<String>mylist=new ArrayList<String>(mobiles);
		System.out.println(mylist.get(1));
		
		
		
		
		
		
		
		
	}

}
