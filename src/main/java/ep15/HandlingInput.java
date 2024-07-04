
package ep15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingInput {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/edit");
		driver.manage().window().maximize(); 
		
		
		//Enter you full name
		driver.findElement(By.xpath("//input[@placeholder='Enter first & last name']")).sendKeys("Logeshwaran");
		
		//Append a text and press keyboard tab
		driver.findElement(By.id("join")).sendKeys(" dude" , Keys.TAB);
		
		//What is inside the text box
		String getMe = driver.findElement(By.id("getMe")).getAttribute("value");
		System.out.println(getMe);
		
		//Clear the text
		driver.findElement(By.id("clearMe")).clear();
		
		//Confirm edit field is disabled
		boolean isenabled =  driver.findElement(By.xpath("//input[@id='noEdit']")).isEnabled();
		System.out.println(isenabled);
		
		//Confirm  text is readonly
		String isReadonly = driver.findElement(By.id("dontwrite")).getAttribute("readonly");
		System.out.println(isReadonly);
		//Quit
		driver.quit();
		
		
		
		
		
	
	
	
	
	}

}
