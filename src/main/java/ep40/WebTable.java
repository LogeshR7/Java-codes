package ep40;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/table");
		
		//find the table
		WebElement table=driver.findElement(By.id("simpletable"));
		
		//find the header and print all
		List<WebElement>header=table.findElements(By.tagName("th"));
		for (WebElement Header : header) {
			String text=Header.getText();
			System.out.println(text);
			
		}                                        //td=coloumn
		
		//Firstname
		List<WebElement>allrow=table.findElements(By.cssSelector("tbody tr"));
		for (WebElement Firstname : allrow) {
			List<WebElement>coloum=Firstname.findElements(By.tagName("td"));
			WebElement names=coloum.get(0);
			System.out.println(names.getText());
			
		}
		
		
		//size
		int Size=allrow.size();
		System.out.println(Size);
		if (Size==3) {
			System.out.println("Test case pased");		
		}else {
			System.out.println("Fail");
		}
		
		//Mark raj is present
		for (int i = 0; i < Size; i++) {
			
		}
		
	
	}

}
