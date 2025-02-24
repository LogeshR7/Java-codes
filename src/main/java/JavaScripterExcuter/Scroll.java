package JavaScripterExcuter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class Scroll {
	
	public static void main(String[]args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.worldometers.info/geography/flags-of-the-world/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(300,678)");
		
		js.executeScript("window.scrollBy(300,678)");
		
		
		
		
		
	}

}
