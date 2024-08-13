package ep42;

///THapaa potain this is not expection handling

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandlinggRemit {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://remittance.ocs.org/remittance/public/reports/currencybalancereport");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//Login
		driver.findElement(By.id("login")).sendKeys("dosth",Keys.TAB,"itsmedosth",Keys.ENTER);
		
		//Report
		driver.findElement(By.xpath("//span[text()='R']")).click();
		
		WebElement list=driver.findElement(By.linkText("Currency Report"));
		Actions bulider=new Actions(driver);
		bulider.moveToElement(list).perform();
		driver.findElement(By.linkText("Currency Balance Report")).click();
		
	String parentWindow=driver.getWindowHandle();
	
	driver.findElement(By.linkText("AUD")).click();
	
	Set<String>allwindows=driver.getWindowHandles();
	for (String child : allwindows) {
		driver.switchTo().window(child);
		
	}
	System.out.println(driver.getTitle());
	driver.close();
	
	//come to parentwindow
	driver.switchTo().window(parentWindow);
     	System.out.println(driver.getTitle());	
		driver.quit();
		
	}

}
