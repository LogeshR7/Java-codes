package ep41;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExpicitiWAit {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/waits");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//Find Button
		driver.findElement(By.xpath("//button[@id='accept']")).click();
		
		//Alert WAit
		Alert input=wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(input.getText());
		driver.switchTo().alert().accept();
		
	
		//invisibilityText
		driver.manage().window().maximize();
		driver.get("https://letcode.in/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("email")).sendKeys("Logesh@gmail.com",Keys.TAB,"123456",Keys.ENTER);
		WebElement toster=driver.findElement(By.xpath("//div[@role='alertdialog']"));
		wait.until(ExpectedConditions.visibilityOf(toster));
		System.out.println(toster.getText());
		boolean Until=wait.until(ExpectedConditions.invisibilityOf(toster));
		System.out.println(Until);
		driver.findElement(By.linkText("Sign out")).click();
		
		//visibility
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		WebElement Electronic=driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions bulider=new Actions(driver);
		bulider.moveToElement(Electronic).perform();
		driver.findElement(By.linkText("Samsung")).click();
		wait.until(ExpectedConditions.titleContains("Samsung"));
		System.out.println(driver.getTitle());
		
		
		


		
		
	}

}
