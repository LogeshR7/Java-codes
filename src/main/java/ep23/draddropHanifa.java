package ep23;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class draddropHanifa{
	public static void main(String[] arg) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://haniffakl.asuscomm.com:2311/Demo/");
		
		//Login
		driver.findElement(By.name("email")).sendKeys("durai");
		driver.findElement(By.name("password1")).sendKeys("Mani1206*");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().window().maximize();
		
		//Purchase
		driver.findElement(By.xpath("//span[text()='Purchase']")).click();
		driver.findElement(By.xpath("(//span[text()='ALT+P'])[2]")).click();
		
		
		//dargdorp
		WebElement source=driver.findElement(By.xpath("//td[text()='POHQ2407002429']"));
		WebElement target=driver.findElement(By.xpath("//input[@placeholder='Transaction / Reference No']"));
		Actions bulider = new Actions(driver);
	bulider.dragAndDrop(source, target).perform();
		
		
		
		
		
	}
}
