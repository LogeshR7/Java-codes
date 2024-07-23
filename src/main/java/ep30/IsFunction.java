package ep30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsFunction {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/edit");
		driver.manage().window().maximize();
		
		//Isdisplayed
		WebElement is=driver.findElement(By.linkText("Sign up"));
		boolean d=is.isDisplayed();
		System.out.println(d);
		
		WebElement si=driver.findElement(By.xpath("//label[text()='Enter your full Name']"));
		System.out.println(si.isDisplayed());
		
		//IsEnabled
		WebElement e=driver.findElement(By.id("noEdit"));
		System.out.println(e.isEnabled());
		//desing using css style disable
		driver.navigate().to("https://semantic-ui.com/elements/button.html");
		WebElement dd=driver.findElement(By.xpath("(//i[@class='user icon'])[2]"));
		//System.out.println(dd.isEnabled());
		String get=dd.getAttribute("class");
		System.out.println(get);
		System.out.println(get.contains("user icon"));
		
		//Isselected
		driver.navigate().to("https://letcode.in/radio");
		WebElement iss=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		boolean chek=iss.isSelected();
		System.out.println(chek);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
