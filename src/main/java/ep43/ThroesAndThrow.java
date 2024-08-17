package ep43;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ThroesAndThrow {
/*	public void code()  {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			throw new RuntimeException();
		}
	}
	
	public static void main(String[] args) {
		ThroesAndThrow it=new ThroesAndThrow();
		it.code();
		
		*/
		
	public static void main(String args[]) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("http://asset.management.upc.org/login");
		driver.manage().window().maximize();
		
		try{
			driver.findElement(By.id("email1")).sendKeys("admin.ocs@gmail.com");
		}catch (Exception e) {
			System.err.println("No Element Found");
			throw new RuntimeException();
			
		}
			

		driver.findElement(By.id("password")).sendKeys("Ocs@2024");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	
	}
}

