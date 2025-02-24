package JavaScripterExcuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToEle {
public static void main(String[]args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.worldometers.info/geography/flags-of-the-world/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
	WebElement ele1=	driver.findElement(By.xpath("//img[@src='/img/flags/small/tn_mg-flag.gif']"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true)",ele1);
		//div[text()='Brazil']
		
		WebElement ele2=	driver.findElement(By.xpath("//div[text()='Brazil']"));
		js.executeScript("arguments[0].scrollIntoView(true)", ele2);
//flase=bottom
		//true=top
}
}
