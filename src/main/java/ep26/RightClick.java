package ep26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_oncontextmenu_dom");

		//Switch frame
		WebElement dv =driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(dv);

		//hover
		WebElement ele=	driver.findElement(By.id("div01"));
		Actions bulider =new Actions(driver);
		bulider.contextClick(ele).perform();

	}

}
