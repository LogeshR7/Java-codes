
package ep6;

public class localAndInstant {
	
	int c = 25;
	String d = "kim";
	
	void number (int a ,int b ,int c) {
		System.out.println(a+b+this.c);
		
	}
	
	
	int number() {
		return 99;		
	}
	
	void name(String a , String b,String d) {
		System.out.println(a+b+number()+this.d);
	}
	
	
	public static void main(String[] args) {
		localAndInstant ub = new localAndInstant();
		ub.name("logesh", "logesh","hin");
		
		//int bim = ub.number();
		
		System.out.println(ub.number()); //note this point
		
		ub.number(44, 55, 445);	
		
			
		}
	

}
