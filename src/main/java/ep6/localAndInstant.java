package ep6;

public class localAndInstant {
	
	int c = 25;
	
	void number (int a ,int b ,int c) {
		System.out.println(a+b+this.c);
		
	}
	
	
	int number() {
		return 99;		
	}
	
	void name(String a , String b) {
		System.out.println(a+b+number());
	}
	
	
	
	public static void main(String[] args) {
		localAndInstant ub = new localAndInstant();
		ub.name("logesh", "logesh");
		int bim = ub.number();
		System.out.println(ub.number());
	}

}
