package ep14;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HanifaKL {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://haniffakl.asuscomm.com:2311/Demo/");
		driver.manage().window().maximize();
		//Login
		driver.findElement(By.name("email")).sendKeys("durai");
		Thread.sleep(1000);
		driver.findElement(By.name("password1")).sendKeys(("Mani1206*"));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@id='remembermelbl']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//Purchase
		driver.findElement(By.linkText("Purchase")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Purchase Order')]")).click();
		//driver.findElement(By.xpath("//button[@name='purchase_button']")).click(); //Insert
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@title='View']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=' Back']")).click();
		Thread.sleep(2000);
		//Stock
		driver.findElement(By.xpath("//span[text()='Stock']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='fa fa-sign-out']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='fa fa-list-alt']")).click();
		Thread.sleep(2000);
		//switch driver
		String parwin=driver.getWindowHandle();
		Set<String> allwin=driver.getWindowHandles();

		for(String eachwinid:allwin){
		if(!parwin.equals(eachwinid)){
		driver.switchTo().window(eachwinid);
		}

		}
		
		driver.findElement(By.xpath("(//button[@name='purchase_button'])[2]")).click(); //this is redirecting to next page so not working need to study
		driver.findElement(By.xpath("//span[text()='Stock']")).click();   
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//i[@class='fa fa-sign-out']")).click();
		
		
		
		//Stock adjustment
		driver.findElement(By.xpath("//span[text()='Stock']")).click();
		driver.findElement(By.id("stock_adjust")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@title='View']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='purchase_button']")).click();
		Thread.sleep(1000);
		//Report
		//driver.findElement(By.xpath("//i[@class='icon-bar-chart']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.linkText("Low Stock Report")).click();
		///Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[text()=' Back']")).click();
		//Thread.sleep(2000);
		//Logout
		driver.findElement(By.xpath("//i[@class='fa fa-power-off']")).click();
		
		
		
		
		
		
	}
}
