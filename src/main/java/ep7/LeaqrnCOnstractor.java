
package ep7;


public class LeaqrnCOnstractor {

	int a;
	String b;
	double c;
	
	/*
	 * public LeaqrnCOnstractor() { this.a=22; this.b="logesh"; this.c=22.5; }
	 */
	
	LeaqrnCOnstractor(int a ,String b, double c){
		this.a=a;
		this.b=b;
		this.c=c;
		
				
	}
	
	public LeaqrnCOnstractor(int h) {
		this.a=h;
		
	}
	
	
	
	void number() {
		System.out.println(a+"----"+b+"----"+c);
	}
	
	void num() {
		System.out.println(a);
	}
	

public static void main(String[] args) {
	LeaqrnCOnstractor mt = new LeaqrnCOnstractor(25,"logesk",22.5);
	mt.number();
	
	LeaqrnCOnstractor mt1 = new LeaqrnCOnstractor(26);
	mt1.num();
}


}


