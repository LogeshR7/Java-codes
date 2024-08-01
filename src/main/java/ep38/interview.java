package ep38;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class interview { 
	public static void main(String[] args)  {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://www.google.co.in/");
	
	
	driver.manage().window().maximize();
	

	
	
	driver.findElement(By.name("q")).sendKeys("Cricket" , Keys.ENTER);
	
	List<WebElement> count1=driver.findElements(By.xpath("//*[contains(text(),'Cricket') or contains(text(),'cricket')]"));
	
	System.out.println(count1.size());
	
	//xpath-//*[contains(text(),'remit') or contains(text(),'Remit')]
	

	
	
	}

}
