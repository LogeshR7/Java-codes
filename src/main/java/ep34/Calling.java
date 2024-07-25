package ep34;

public class Calling {
	public static void main(String[] args) {
		AXIS MYbank=new AXIS();
		MYbank.aadharManidory();
		boolean gg=MYbank.PanMandtory();
		System.out.println(gg);
		String mm=MYbank.intersfreeloan();
		System.out.println(mm);
		int upilimt=AXIS.UPILIMT;
		System.out.println(upilimt);
		
	SBI bank=new SBI();
	bank.aadharManidory();
	System.out.println(bank.Lifetimecard());
	
	
	
	}
	
	
	
	
	
	

}
