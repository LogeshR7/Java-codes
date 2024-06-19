package ep4;

public class Calling {
public static void main(String[] args) {
 
	Car mt = new Car();
    int Number= mt.carnumber;
    System.out.println(Number);

    float weight = mt.carweight;
    System.out.println(weight);

    String model= mt.CarModel();
    System.out.println(model);
    
    mt.Carname();
    
    boolean run= mt.Carrun();
    System.out.println(run);
    
  short finalprize =  mt.prize();
  System.out.println(finalprize);
   
   int milliage = mt.carmilliage();
   System.out.println(milliage); 
   
    
}
}
