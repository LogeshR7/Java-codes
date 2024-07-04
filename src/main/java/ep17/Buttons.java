package ep17;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttons {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		
		//Get x and y location
		WebElement pos = driver.findElement(By.id("position"));
				Point point =pos.getLocation();
				System.out.println(point);
				int x =point.getX();
				System.out.println(x);
				int y =point.getY();
				System.out.println(y);
				
		//Find the colour of the button 
			WebElement col =driver.findElement(By.id("color"));
			String coll =col.getCssValue("background-color");
			System.out.println(coll);
			
		//Find the height & width of the button
			WebElement HW = driver.findElement(By.id("property"));
		 Rectangle sizee=HW.getRect();
		 int hi = sizee.getHeight();
		 System.out.println(hi);
		 sizee.getWidth();
		 System.out.println(sizee.getWidth());
		 sizee.getPoint();
		 System.err.println(sizee.getPoint());
		 
		 //is disabled
		 boolean dis = driver.findElement(By.xpath("(//button[@id='isDisabled'])[1]")).isEnabled();
		 System.out.println(dis);
		 
		 //hold Need to study

		   
		 Robot robot = new Robot();
	        WebElement holdButton = driver.findElement(By.xpath("//h2[text()='Button Hold!']"));
	        holdButton.click();
	        robot.keyPress(KeyEvent.VK_ENTER);
	        Thread.sleep(2000); 
	        robot.keyRelease(KeyEvent.VK_ENTER);
	        System.out.println("done");
		 
		 
			
		
		 
			
				
				
		
	}
}
