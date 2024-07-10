package ep21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iFrame {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/frame");
		driver.manage().window().maximize();
		//frame switching using index(means 0,1,2)
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@placeholder='Enter name']")).sendKeys("logesh");
		driver.findElement(By.xpath("(//input[@placeholder='Enter email'])[1]")).sendKeys("waran");

		//print the given text
		WebElement kim =driver.findElement(By.xpath("//p[@class='title has-text-info']"));
		System.out.println(kim.getText());

		//Switch to child frames using iframe xpath
		WebElement jim =driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		driver.switchTo().frame(jim);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("djhdjsh");


		//Switch to parentframe means(currenct frame -1)
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@placeholder='Enter name']")).sendKeys("logesh");


		//Switch to default main page
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Watch tutorial")).click();


	}


}
