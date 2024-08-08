package ep40;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleTabale {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/table");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Find the table
		WebElement table=driver.findElement(By.id("simpletable"));
		
		//Find the header and print all
		List<WebElement>headers=table.findElements(By.tagName("th"));
		for (WebElement Headers : headers) {
		String alltext=	Headers.getText();
		System.out.println(alltext);	
		}
	
     	//Firstname
		List<WebElement>allrows=table.findElements(By.cssSelector("tbody tr"));
		for (WebElement FistName : allrows) {
			List<WebElement>all=FistName.findElements(By.tagName("td"));
			WebElement Get=all.get(0);
			System.out.println(Get.getText());
			
		}
		
		//Size
		int Size=allrows.size();
		if (Size==3) {
			System.out.println("Case passed");	
		}else {
			System.out.println("Fail");
		}
		
		//Mark Man is present
		for (int i = 0; i < Size; i++) {
			List<WebElement>LastNamecoloumn=allrows.get(i).findElements(By.tagName("td"));
			WebElement man=LastNamecoloumn.get(1);
			String Text=man.getText();
			if (Text.equals("Man")) {
				LastNamecoloumn.get(3).findElement(By.tagName("input")).click();
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
