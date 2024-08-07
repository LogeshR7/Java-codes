package ep39;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testleaf {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		String parentwindow=driver.getWindowHandle();
		
		//Click and confirm new windows opens
		driver.findElement(By.xpath("//button[@role='button']")).click();
	   
		//Show how many windows open
		System.out.println(driver.getWindowHandles().size());
	
		 //Close the newly opened window
		
		Set<String>allwindow=driver.getWindowHandles();
		for (String newwindow : allwindow) {
			driver.switchTo().window(newwindow);
			
		}
		System.out.println(driver.getTitle());
		driver.close();
		
		//Switch to parent window
		driver.switchTo().window(parentwindow);
	
		//Wait for 2 new tabs to open
		driver.findElement(By.id("j_idt88:j_idt95")).click();
		
		
		for (String close : allwindow) {
			if (!close.equals(parentwindow)) {
				driver.switchTo().window(close);
				driver.close();
			
			}
			
		}
	
		
	}

}
