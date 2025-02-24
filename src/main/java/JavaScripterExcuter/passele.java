package JavaScripterExcuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class passele {
public static void main(String[]args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement email=driver.findElement(By.id("email"));
		
		js.executeScript("arguments[0].value='Logesh'", email);
		
		js.executeScript("arguments[0].value='waran'", email);
		
		
		

}
}
