
package ep9;

import java.net.MulticastSocket;
import java.util.Arrays;

public class LearnArrayes {
	
	public static void main(String[] args) {
		
		String[]fruit={"mango","papay","orange","pineapple","pears","apple"};
		System.out.println(fruit[4]);
		System.out.println(fruit.length);
		System.out.println(fruit[fruit.length-1]);
		System.out.println(Arrays.toString(fruit));
		
		for(int i=0;i<fruit.length;i++) {
			System.out.println(fruit[i]);
		}
		
		String vegtable[]=new String [4];
		vegtable[0]="logveg";
		vegtable[1]="carrot";
	    vegtable[2]="benas";
	    vegtable[3]="lady fingure";
	    //vegtable[4]="pavaka";
	    //vegtable[5]="KOvakai";
		
System.out.println(Arrays.toString(vegtable));
System.out.println(vegtable.length);
System.out.println(vegtable[vegtable.length-1]);
System.out.println(vegtable[2]);

for(int l=0;l<vegtable.length;l++) {  //loop condition
	System.out.println(vegtable[l]);
}

	}

}
