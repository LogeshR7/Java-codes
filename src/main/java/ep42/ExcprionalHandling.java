package ep42;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcprionalHandling {
	public static void main(String[] args) {
		System.out.println("hi");
		Scanner input=new Scanner(System.in);
		
		try {
			int num=input.nextInt();
			
			int a=num%0;
			System.out.println(a);
			
		} catch (ArithmeticException e) {
			System.err.println("Divisible by zero is not possible");
			
			
		}catch (InputMismatchException e) {
			System.err.println("please enter numbr");
		}finally {
			input.close();
		}
		
		System.out.println("Completed");
		
		
		
		
		
		
	}

}
