package ep40;

import java.util.List;

import org.apache.commons.lang3.function.FailableLongConsumer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firsttable {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/table");
		
		//Find a table
		WebElement table=driver.findElement(By.id("shopping"));
		
		//print all header
		List<WebElement>allheaders=table.findElements(By.tagName("th"));
		for (WebElement Headers : allheaders) {
			String headerText=Headers.getText();
			System.out.println(headerText);
			
		}
		//print the prize
		int sum=0;
		List <WebElement> allcoloumn=table.findElements(By.cssSelector("tbody tr"));
		for (WebElement prize : allcoloumn) {
			List<WebElement>Allprize=prize.findElements(By.tagName("td"));
			WebElement number=Allprize.get(0);
			String textt=number.getText();
			System.out.println(textt);
	}	
			
		}
			
			
		}
		
	
	

	


