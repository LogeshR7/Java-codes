package ep32;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SUbmit {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://remittance.ocs.org/remittance/public/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		//only submit work the element are in the form attribute
		//Login
		driver.findElement(By.id("login")).sendKeys("dosth");
		WebElement ele=driver.findElement(By.id("password"));
		ele.sendKeys("itsmedosth");
		ele.submit();
		
	}

}
