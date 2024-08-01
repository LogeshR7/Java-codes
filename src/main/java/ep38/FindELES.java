package ep38;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindELES {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/edit");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		List<WebElement>mylabel=driver.findElements(By.tagName("label"));
		//We use get text for get the text from dom , we print lable it give some code
		WebElement j=mylabel.get(1);
		System.out.println("thakuri---"+j.getText());
		
		//check the size using if or else
		int sizz=mylabel.size();
		if (sizz==5) {
			System.out.println("passed");

		}else {
			System.out.println("fail");
		}

		//Loop for print all we need the label text so we use get text
       for (WebElement label : mylabel) {
			System.out.println(label.getText());

		}
       
       //isempty
      boolean erukaillay= mylabel.isEmpty();
      System.out.println(erukaillay);
       
		
      
      
      
      
      
      
      driver.quit();
		
		

















	}

}
