package ep29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class closevsQuit {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/windows");
		
		driver.findElement(By.xpath("//button[text()='Muiltiple windows']")).click();
		//driver.close();
		
		
		
	}


}
