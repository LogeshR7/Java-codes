package ep27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RemitAndDrop{
	
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://remittance.ocs.org/remittance/public/login");
		
		
		//Login
		driver.findElement(By.id("login")).sendKeys("dosth");
		driver.findElement(By.id("password")).sendKeys("itsmedosth");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.manage().window().maximize();
		
		//Remit
		driver.findElement(By.linkText("Remit")).click();
		driver.findElement(By.linkText("Customer Code")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		
		WebElement path =driver.findElement(By.xpath("//select[@name='beneficairy_screening']"));
		Select bene =new Select(path);
		bene.selectByValue("1");
		
		driver.findElement(By.xpath("(//i[@class='i-Business-Mens'])[4]")).click();
		Thread.sleep(2000);
		//driver.findElement(by.)
		
		
	}
		
	
	
}