package SoftAssert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Softaseert {
	
	public static void main(String[]args) {
	
		WebDriver driver=new ChromeDriver();
		driver.get("http://haniffakl.asuscomm.com:2311/Demo/");
		
		SoftAssert soft=new SoftAssert();
		
		String Actual=driver.getTitle();
		
		String excpted="Logesj";
		
		
		
		
	soft.assertEquals(Actual,excpted,"Not equal");
	
	driver.close();
	
	
	}

}
