package ep18;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hanifascreen {
   public static void main(String[] arg) throws Exception {
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver = new ChromeDriver();
	   driver.get("http://haniffa.juzapps.com:1205/demo/");
	   
	   TakesScreenshot shte = (TakesScreenshot)driver;
	   File take =shte.getScreenshotAs(OutputType.FILE);
	   File store=new File("F:\\aljemi.juzapps.com./Lokkushot.jpg");
	   FileUtils.copyFile(take, store);
	   
	   WebElement sign =driver.findElement(By.xpath("//button[@class='btn btn-info pull-right']"));
	 File takunu=  sign.getScreenshotAs(OutputType.FILE);
	 File desceh = new File("F:\\\\aljemi.juzapps.com./Lokkushot1.jpg");
	 FileUtils.copyFile(takunu,desceh);
	 
	 WebElement cont =driver.findElement(By.xpath("//div[@class='content']"));
	 File vabule = cont.getScreenshotAs(OutputType.FILE);
	 File bmw = new File("F:\\\\aljemi.juzapps.com./Lokkushot2.jpg");
	 FileUtils.copyFile(vabule, bmw);
	   
	   
	   
	   
	   driver.quit();
	   
	   
	   
	   
   }

}
