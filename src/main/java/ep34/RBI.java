package ep34;

public interface RBI {
	
	int UPILIMT=100000;
	
	public void aadharManidory();
	
	public boolean  PanMandtory();
	
	static void homeloan() {
		System.out.println("homeloannnn free");
	}
	
	default void carloan() {
		System.out.println("carloan vaga vaketu ponga");
		
	}
		
	
}

