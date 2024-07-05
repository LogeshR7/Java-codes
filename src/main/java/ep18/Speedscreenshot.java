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

public class Speedscreenshot {
	public static void main(String[] arg) throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.speedlearningapp.com/");
		
		TakesScreenshot shott = (TakesScreenshot)driver; 
		File srb = shott.getScreenshotAs(OutputType.FILE);
		File decs = new File("C:\\Intel./img.png");
		FileUtils.copyFile(srb, decs);
		
		
		WebElement element = driver.findElement(By.xpath("//button[text()='explore MCH plans']"));
		File srbc = element.getScreenshotAs(OutputType.FILE);
		File descena = new File("C:\\Intel./img2.png");
		FileUtils.copyFile(srbc, descena);
		
	}

}
