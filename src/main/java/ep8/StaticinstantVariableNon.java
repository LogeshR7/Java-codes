
package ep8;

public class StaticinstantVariableNon {
	
	int x;// belong to the function
	static int y;  //belong to the class
	
	public void  incrment() {
		x++;
		y++;
		System.out.println("Non-static-----"+x+"   Static----"+y);
	}
	
	



public static void main(String[] args) {

	StaticinstantVariableNon st = new StaticinstantVariableNon();
	st.incrment();
	st.incrment();
	
	
	
	System.out.println("   gap   ");
	
	 StaticinstantVariableNon st1 = new StaticinstantVariableNon();
	 st1.incrment();
	 st1.incrment();
	 
}

   
   

}
