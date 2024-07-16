package ep24;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dragby {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/draggable");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//div[@id='sample-box']"));
		Actions bulider = new Actions(driver);
		
		int x =ele.getLocation().getX();
		int y =ele.getLocation().getY();
		bulider.dragAndDropBy(ele, x+300, y+200).perform();
		System.out.println(ele.getLocation().getX());
		System.out.println(ele.getLocation().getY());

}
}
