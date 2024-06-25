package ep9;

import java.net.MulticastSocket;
import java.util.Arrays;

public class LearnArrayes {
	
	public static void main(String[] args) {
		
		String[] fruit={"mango","papay","orange","pineapple","pears","apple"};
		System.out.println(fruit[4]);
		System.out.println(fruit.length);
		System.out.println(fruit[fruit.length-1]);
		System.out.println(Arrays.toString(fruit));
		
		for(int i=0;i<fruit.length;i++){     //loop condition for print one by one
		System.out.println(fruit[i]);
			}
		
int [] sqence = new int [4];
sqence[0]=9;
sqence[1]=10;
sqence[2]=11;
sqence[3]=14;

System.out.println(Arrays.toString(sqence));
System.out.println(sqence.length);
System.out.println(sqence[sqence.length-1]);
System.out.println(sqence[2]);

for(int l=0;l<sqence.length;l++) {  //loop condition
	System.out.println(sqence[l]);
}

	}

}
