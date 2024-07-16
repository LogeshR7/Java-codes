package ep24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dargbyJquery {
	public static void main(String[] arg) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		
		driver.switchTo().frame(0);
		WebElement ele =driver.findElement(By.xpath("//div[@id='draggable']"));
		Actions bulider = new Actions(driver);
		int x=ele.getLocation().getX();
		int y=ele.getLocation().getY();
		System.out.println(ele.getRect().getDimension().getHeight());
		
		bulider.dragAndDropBy(ele, x+40,y+60).perform();
		
		
	}

}
