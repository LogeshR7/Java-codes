package ep28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextGetAttribute {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/edit");
		
		
		WebElement text =driver.findElement(By.xpath("(//div[@class='card-content'])[1]"));
		System.out.println(text.getText());
		
		WebElement Text1=driver.findElement(By.id("fullName"));
		System.out.println(Text1.getAttribute("placeholder"));
		
	}

}
