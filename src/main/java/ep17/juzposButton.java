package ep17;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class juzposButton {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://pos.juzapps.com/login");
		driver.manage().window().maximize();
		
		//X AND y location of login button
		 WebElement location =driver.findElement(By.xpath("//button[@type='submit']"));
		 Point po = location.getLocation();
		 System.out.println(location.getLocation());
		 po.getX();
		 System.out.println(po.getX());
		 po.getY();
		 System.out.println(po.getY());
		 
		 
		 //Button colour
		 WebElement him =driver.findElement(By.xpath("//button[@type='submit']"));
		String colour = him.getCssValue("background");
		System.out.println(colour);
		
		
		//Find height and weight
		WebElement hiwi=driver.findElement(By.xpath("//button[@type='submit']"));
		Rectangle hiwii =hiwi.getRect();
		hiwii.getHeight();
		System.out.println(hiwii.getHeight());
		hiwii.getWidth();
		System.out.println(hiwii.getWidth());
		
		//POSTION
		hiwii.getPoint();
		System.out.println(hiwii.getPoint());
		
		//iS ENABLED
		boolean enabled=driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
		System.out.println(enabled);
		
		
		driver.quit();
		
				
		 
		
		
	}
	
	
	


	

}


