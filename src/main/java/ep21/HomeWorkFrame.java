package ep21;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//User to need to come default frame once user in one frame
public class HomeWorkFrame {
	public static void main(String[] arg) throws Exception {
		//https://ui.vision/demo/webtest/frames/

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Frame 1
		WebElement x1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(x1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("logesh frame 1");

		//Frame 2
		driver.manage().window().maximize();
		driver.switchTo().defaultContent();
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Logesh frame2");

		
		//Screenshot
		/*
		 * TakesScreenshot xyz= (TakesScreenshot)driver; File cc=
		 * xyz.getScreenshotAs(OutputType.FILE); File descc=new
		 * File("C:\\Users\\ocs new\\OneDrive\\Pictures\\Camera Roll/logesh.jpg");
		 * FileUtils.copyFile(cc, descc);
		 */		

		//Frame 3
		driver.switchTo().defaultContent();
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("jaii");

		//inner frame pending





		//Frame 4
		driver.switchTo().defaultContent();
		WebElement frame4=driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frame4);
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("jaysri");

		//Frame 5
		driver.switchTo().defaultContent();
		WebElement frame5=driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("jai");
		//driver.findElement(By.linkText("https://a9t9.com")).click();






	}










}
