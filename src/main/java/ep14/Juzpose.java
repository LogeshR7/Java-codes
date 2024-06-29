package ep14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Juzpose {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://juzpos.upc.org/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("durai");  //attribute type link text
		driver.findElement(By.name("password")).sendKeys("Mani1206*");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();            //text link text
		driver.findElement(By.xpath("//button[text()='Logout']")).click();
		
	}

}
