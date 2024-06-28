package ep14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("email")).sendKeys("Logesh@gmail.com");
		driver.findElement(By.name("password")).sendKeys("logesh12345");
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
	}

}
