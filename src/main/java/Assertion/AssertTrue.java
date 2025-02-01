package Assertion;



import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssertTrue {

public static void main(String[]args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("http://haniffakl.asuscomm.com:2311/Demo/");
		
boolean verfietitle=driver.getTitle().equalsIgnoreCase("JuzERP | Login");
System.out.println(verfietitle);

assertTrue(verfietitle,"Not Mached");

driver.close();
}

// Assrtflase is opposite to asserttrue

}

