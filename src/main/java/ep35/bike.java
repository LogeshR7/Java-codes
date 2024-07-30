package ep35;

public class bike extends Vehicle{
	
	public void hasdisk() {
		System.out.println("Disk--kerukeru");
	}
	
	public void brake() {
		super.brake();//super is used to call class from parent
		System.out.println("b------Brake applied");
	}
	
	

}
