package ep38;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class howmany {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://remittance.ocs.org/remittance/public/ttdashboard");
		driver.manage().timeouts().implicitlyWait(22,TimeUnit.SECONDS);
		
		//login
				driver.findElement(By.id("login")).sendKeys("dosth");
				driver.findElement(By.id("password")).sendKeys("itsmedosth");
				driver.findElement(By.xpath("//button[text()='Login']")).click();
				driver.manage().window().maximize();
				
				
				List<WebElement>count=driver.findElements(By.xpath("//*[contains(text(),'remit') or contains(text(),'Remit')]"));
				
				System.out.println(count.size());	
		
		
		
		
	}

}
