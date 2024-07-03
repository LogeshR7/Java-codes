package ep16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class navigationHomeWorkmoney {
	
	public static void main (String[] arg) throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://uat.moneychange.dollarex.com.sg/login");
		driver.manage().window().maximize();
		//Login
		driver.findElement(By.id("login")).sendKeys("dosth");
		driver.findElement(By.id("password")).sendKeys("itsmedosth");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		//Navigates commands
		
		Navigation nav =driver.navigate();
		
          //Buy sell
		driver.findElement(By.linkText("Buy/Sell")).click();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		//driver.findElement(By.xpath("//a[text()='Listing']")).click();
		//Thread.sleep(2000);
		nav.back();
		nav.to("http://remittance.ocs.org/remittance/public/ddtransaction/unpost#");
		nav.to("https://uat.moneychange.dollarex.com.sg/dashboard");
		driver.findElement(By.xpath("//span[text()=' Balance']")).click();
		
		System.out.println(driver.getCurrentUrl());
		
	}
	
}
