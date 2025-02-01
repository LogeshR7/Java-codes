package Assertion;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assertnull {
	
	//Assertnull-This method verifies if the expected output is null. 
	//If not, the value returned is false.
	
	public static void main(String[]args) {
	WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("http://haniffakl.asuscomm.com:2311/Demo/");
		

String verfyisNull=driver.getTitle();

assertNull(verfyisNull,"not null");

driver.close();

//assertnotnull-This method works opposite to the assertNull() method. 
//The assertion condition is met when the method validates the expected output to be not null.
		
		
	}
	

}
