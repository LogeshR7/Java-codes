package ep33;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class activeElement {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement him=driver.switchTo().activeElement();
		him.sendKeys("Caryou2.lw@gmail.com",Keys.TAB,"7708681908",Keys.ENTER);
		
		
		
	}
	

}
