package ep38;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindhowmanyFrames {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		List<WebElement>count=driver.findElements(By.tagName("frame"));
		System.out.println(count.size());
		for (WebElement myele : count) {
			System.out.println(myele.getAttribute("src"));
			
		}
		
		WebElement ele=count.get(2);
		System.out.println(ele.getAttribute("src"));
	
	
	
	
	
	
	}
	

}
