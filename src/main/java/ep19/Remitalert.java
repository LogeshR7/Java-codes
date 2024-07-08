package ep19;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Remitalert {
public static void main(String[] arg) throws Exception {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://dollarremit.juz4x.com/login");
	
	//Login
	driver.findElement(By.id("login")).sendKeys("dosth");
	driver.findElement(By.id("password")).sendKeys("itsmedosth");
	driver.findElement(By.xpath("//button[text()='Login']")).click();
	driver.manage().window().maximize();
	
	//Dayclose alert
	driver.findElement(By.xpath("//span[text()='Day Close']")).click();
	driver.findElement(By.xpath("//button[text()='Submit']")).click();
	//Thread.sleep(2000);
	//Alert tect =driver.switchTo().alert();
	//System.out.println(tect.getText());
	driver.findElement(By.xpath("//button[text()='ok']")).click();
	//tect.accept();
	driver.quit();
	
	
	
	
	
}

}
