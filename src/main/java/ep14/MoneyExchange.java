package ep14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoneyExchange {
public static void main(String[] args)  {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://uat.moneychange.dollarex.com.sg/login");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@name='login']")).sendKeys("dosth");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("itsmedosth");
	driver.findElement(By.xpath("//button[text()='Login']")).click();
	driver.findElement(By.xpath("//i[@class='i-Lock']")).click();
	
	
	
}

}
