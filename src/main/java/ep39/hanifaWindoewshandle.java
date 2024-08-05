package ep39;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hanifaWindoewshandle {
	public static void main(String[] args)  {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://haniffakl.asuscomm.com:2311/Demo/");
		
		//Login
		driver.findElement(By.name("email")).sendKeys("durai" , Keys.TAB , "Mani1206*",Keys.ENTER);
		driver.manage().window().maximize();
		
		//Stock
		driver.findElement(By.xpath("//span[text()='Stock']")).click();
		
		driver.findElement(By.xpath("//i[@class='fa fa-sign-out']")).click();
		
		//view
		driver.findElement(By.xpath("//i[@title='View']")).click();
		
	 System.out.println(driver.getTitle());
	  System.out.println(driver.getCurrentUrl());
	    
	    //Switch to view screen
	   Set<String>set= driver.getWindowHandles();
	   List<String>list=new ArrayList<String>(set);
	  
	   driver.switchTo().window(list.get(1));
	  System.out.println(driver.getCurrentUrl());
	  
	  
	  //print all url
	  Iterator<String>it=set.iterator();
	  
	 while (it.hasNext()) {
		 
		 driver.switchTo().window(it.next());
		 System.out.println(driver.getCurrentUrl());
		
	}
	  
	 
	 //close parent tab
	 driver.switchTo().window(list.get(0));
	 driver.close();
	 
	 //Switch to child tab
	 list.clear();
	 Set<String>Set1=driver.getWindowHandles();
	 list.addAll(Set1);
	 driver.switchTo().window(list.get(0));
	 System.out.println(driver.getCurrentUrl());
	 driver.close();
	 
	 
		
		
	}

}
