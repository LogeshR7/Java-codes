package JavaScripterExcuter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FullScroll {
public static void main(String[]args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.worldometers.info/geography/flags-of-the-world/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//down
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)" );
		
		Thread.sleep(2000);
		//top
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
	

}
}
