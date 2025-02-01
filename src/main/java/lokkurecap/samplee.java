package lokkurecap;

public class samplee {
    public int getSum(int a, int b) {
        int sum = a + b;
		return sum;
   }    

    public static void main(String args[]) {

    	samplee obj = new samplee();
        System.out.println(obj.getSum(10, 20));
    }   

}
