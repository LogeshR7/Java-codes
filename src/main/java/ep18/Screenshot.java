package ep18;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		
		TakesScreenshot shot  = (TakesScreenshot)driver;
		File src = shot.getScreenshotAs(OutputType.FILE);
		File dec = new File ("E:\\New-vue/img1.png");
		FileUtils.copyFile(src, dec);
		
		
		WebElement eleme = driver.findElement(By.id("home"));
		File ele = eleme.getScreenshotAs(OutputType.FILE);
		File decc = new File("E:\\New-vue/img2.png");
		FileUtils.copyFile(ele, decc);
		
		WebElement section = driver.findElement(By.xpath("(//div[@class='card-content'])[2]"));
		File pop = section.getScreenshotAs(OutputType.FILE);
		File deccc=new File("E:\\New-vue/img3.png");
		FileUtils.copyFile(pop,deccc);
		
		
		
		
		
		
	}

}
