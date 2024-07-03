package ep16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigationcodes {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");

		String buttonppage = driver.getCurrentUrl();
		System.out.println(buttonppage);

		driver.findElement(By.xpath("//button[text()='Goto Home']")).click();

		System.out.println(driver.getCurrentUrl());
		
		 
		 driver.navigate().back(); Thread.sleep(3000); driver.navigate().refresh();
		 Thread.sleep(3000); driver.navigate().forward(); Thread.sleep(3000);
		 driver.navigate().to("https://letcode.in/signin");
		

		Navigation nav = driver.navigate();
		nav.back();
		nav.forward();
		nav.refresh();

	}

}
