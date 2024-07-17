package ep25;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {
	
	public static void main (String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Hover
		WebElement ds=driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions bulider = new Actions(driver);
		bulider.moveToElement(ds).perform();
		
		driver.findElement(By.linkText("Gaming")).click();
		//navigate to back
		driver.navigate().back();
		
		
	}

}
