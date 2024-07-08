package ep19;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HanifaKLAlert {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://haniffakl.asuscomm.com:2311/Demo/");
		
		//login
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("durai");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Mani1206*");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		//Purchase

Thread.sleep(2000);
       driver.findElement(By.xpath("//span[text()='Purchase']")).click();
       driver.findElement(By.xpath("//i[@class='fa fa-shopping-cart']")).click();
		driver.findElement(By.xpath("(//i[@class='fa fa-edit'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='Purchase']")).click();
		Thread.sleep(2000);
		Alert ju =driver.switchTo().alert();
		String tr=ju.getText();
		System.out.println(tr);
		ju.dismiss();
		driver.findElement(By.xpath("//span[text()='Purchase']")).click();
		Thread.sleep(2000);
		Alert yu=driver.switchTo().alert();
		String hu=yu.getText();
		System.out.println(hu);
		yu.accept();
		
		
	}

}
