package Assertion;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssertionEquals {

	public static void main(String[]args) {
		
	WebDriver driver=new ChromeDriver();
	
	driver.navigate().to("http://haniffakl.asuscomm.com:2311/Demo/");
	
String ActualTitle=	driver.getTitle();
System.out.println(ActualTitle);
String ExpectedResult="JuzERP | Login";

assertEquals(ActualTitle,ExpectedResult,"Title Does not matches");	
driver.quit();

		
	}
	
}
