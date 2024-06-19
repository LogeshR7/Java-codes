package ep5;

public class Mobile {
	
	public void MobileType() {
		System.out.println("Android");
	}
	
	public void MobileBrand() {
		System.out.println("oppo");
	}
	
	public void dail(int number , String name) {
		System.out.println("Dailed - " + number + name);
	}
	
	public void dail(long Phonenumber , char firstletter) {
		System.out.println("Calling  -  " + Phonenumber + firstletter);
		
	}
	
	public void dail(String oppodialr) {
		System.out.println("Dalier name -  " + oppodialr);
	}
	
	
	
	
	public static void main(String[] args) {
		Mobile mb = new Mobile();
		mb.MobileType();
		mb.MobileBrand();
		mb.dail("oppo");
		
	}

}
