package ep24;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
///Experiment xxxxx
public class Exeprement {
	
public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("http://haniffakl.asuscomm.com:2311/Demo/");
	driver.manage().window().maximize();
	
	
	//Login
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("durai");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Mani1206*");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	//Purchase
	driver.findElement(By.xpath("//span[text()='Purchase']")).click();
	driver.findElement(By.xpath("//i[@class='fa fa-shopping-cart']")).click();
	
	WebElement so =driver.findElement(By.xpath("//td[text()='POHQ2407002429']"));
	Actions bulider =new Actions(driver);
	bulider.doubleClick(so).perform();
	//nOT WORKING FOR SOME RESON
	Thread.sleep(2000);
	driver.findElement(By.xpath("//td[text()='POHQ2407002429']")).sendKeys(Keys.chord(Keys.CONTROL,"c"));
	
	driver.findElement(By.xpath("//input[@name='filter_transactionno']")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
	
	
	
	
	
	
	
	
	
	
	
}
	

}
