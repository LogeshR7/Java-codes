package ep19;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertes {
	public static void main(String[] arg) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://letcode.in/alert");
		
		//Simple alert
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();
		Alert print =driver.switchTo().alert();
		String text =print.getText();
		System.out.println(text);
	    print.accept();
	    
	    //Conform alert
	    driver.findElement(By.xpath("//button[text()='Confirm Alert']")).click();
	    Alert hm =driver.switchTo().alert();
	    String word =hm.getText();
	    System.out.println(word);
	    Thread.sleep(2000);
	    print.dismiss();
	    
	    //Prompt alert
	    driver.findElement(By.xpath("//button[text()='Prompt Alert']")).click();
	   Alert ym=driver.switchTo().alert();
	   ym.sendKeys("Lokku tHe Gokku");
	   System.out.println(ym.getText());
	   ym.accept();
	   
	
	
	}
	
}
