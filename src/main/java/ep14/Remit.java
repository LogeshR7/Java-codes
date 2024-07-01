package ep14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Remit {
	public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("http://remittance.ocs.org/remittance/public/login");
	driver.manage().window().maximize();
	
	//Login
	driver.findElement(By.id("login")).sendKeys("dosth");
	driver.findElement(By.id("password")).sendKeys("itsmedosth");
	driver.findElement(By.xpath("//button[text()='Login']")).click();
	
	//Remit
	driver.findElement(By.xpath("(//a[@class='nav-item-hold'])[1]")).click();
	driver.findElement(By.xpath("(//a[text()='List'])[2]")).click();
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//a[text()='R000006']")).click(); This redirect to next page need to study
	driver.findElement(By.xpath("(//a[@class='nav-item-hold'])[3]")).click();
	driver.findElement(By.xpath("(//a[text()='Listing'])[3]")).click();
	driver.findElement(By.xpath("(//span[@class='checkmark'])[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("Search_ledger")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//i[@title='Edit'])[1]")).click();
	driver.findElement(By.xpath("//input[@placeholder='Remarks From']")).sendKeys("loganathan");
	
	}

}
