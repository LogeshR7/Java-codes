package ep19;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class homeworkW3 {
public static void main(String[] arg) throws Exception {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	//Switching frame
	WebElement xcv =driver.findElement(By.xpath("//iframe[@name='iframeResult']"));
	driver.switchTo().frame(xcv);
	//Alert
	driver.findElement(By.xpath("//button[text()='Try it']")).click();
	Alert switc = driver.switchTo().alert();
	switc.sendKeys("Logeshwaran");
	//get Text
	System.out.println(switc.getText());
	switc.accept();
	WebElement himko =driver.findElement(By.id("demo"));
	System.out.println (himko.getText());
	
	TakesScreenshot pic = (TakesScreenshot)driver;
	File photo = pic.getScreenshotAs(OutputType.FILE);
	File descnaation = new File("C:\\Users\\ocs new\\Videos\\AnyDesk/logesh.jpg");
	FileUtils.copyFile(photo, descnaation);
	
	
	
driver.quit();
	
}
}
