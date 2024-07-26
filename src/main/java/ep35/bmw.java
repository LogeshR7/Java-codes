package ep35;

public class bmw extends bike {
	int milliage= 22;
	
	float Tankcapacity=22.2f;
	
	public String bikeColour() {
		return"Yellow";
	}
	
	public static void main(String[] args) {
		bmw myBike=new bmw();
	  
		int millie= myBike.milliage;
	   System.out.println(millie);
	   
	   float tank=myBike.Tankcapacity;
	   System.out.println(tank);
	   
	String jj=myBike.bikeColour();
	System.out.println(jj);
	
	myBike.hasdisk();
	
	myBike.brake();
	   
	   
	   
	   
	}
	
	
	

}
