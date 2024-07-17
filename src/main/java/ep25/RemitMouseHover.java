package ep25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RemitMouseHover {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://remittance.ocs.org/remittance/public/login");
		driver.manage().window().maximize();
		
		//login
		driver.findElement(By.id("login")).sendKeys("dosth");
		driver.findElement(By.id("password")).sendKeys("itsmedosth");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		//Hover
		driver.findElement(By.id("masterMenuDropdown")).click();
		WebElement ele=driver.findElement(By.linkText("Others"));
		Actions bulider = new Actions(driver);
		bulider.moveToElement(ele).perform();
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Country Master")).click();
		
		//navigate
		Thread.sleep(2000);
		driver.navigate().back();
		
		//Quit
		driver.quit();
		
		
	
	}
	
	

}
