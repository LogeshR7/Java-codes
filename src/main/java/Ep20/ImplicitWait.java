package Ep20;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {
	public static void main(String[] arg) {
		 WebDriverManager.chromedriver().setup(); WebDriver driver=new ChromeDriver();
		 driver.get("http://remittance.ocs.org/remittance/public/login");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//this can wait 10 second untill find the element
		 driver.findElement(By.id("login")).sendKeys("dosth");
		 driver.findElement(By.id("password")).sendKeys("itsmedosth");
		 driver.findElement(By.xpath("//button[text()='Login']")).click();
		 
		 
		 
		 
		
	}

}
