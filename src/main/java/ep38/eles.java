package ep38;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class eles {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://remittance.ocs.org/remittance/public/ttdashboard");
		//login
		driver.findElement(By.id("login")).sendKeys("dosth");
		driver.findElement(By.id("password")).sendKeys("itsmedosth");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.manage().window().maximize();
		
		List<WebElement> navtext=driver.findElements(By.className("nav-text"));
		
		//loop for print all using get text
		for (WebElement all : navtext) {
			System.out.println(all.getText());
			
		}
		
	WebElement getu=navtext.get(navtext.size()-1);
	System.out.println("lastelement---"+getu.getText());
	
	//Size
	int size=navtext.size();
	if (size==8) {
		System.out.println("ne pass da");
		
	}else {
		System.out.println("ne fail da");
	}
	
		
		
		
		
		
	}

}
