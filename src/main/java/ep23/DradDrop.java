package ep23;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DradDrop {
	public static void main(String[] arg) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://letcode.in/dropable");
		
		
		WebElement sourcer = driver.findElement(By.id("draggable"));
		WebElement traget = driver.findElement(By.id("droppable"));
		Actions bulider = new Actions(driver);
		bulider.dragAndDrop(sourcer, traget).perform();
		
		
		
		
	}

}
