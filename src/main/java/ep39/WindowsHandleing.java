package ep39;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandleing {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/windows");
		
		//Click on homebutton
		driver.findElement(By.xpath("//button[@id='home']")).click();
		
		//geturl that show the ehat page are we(We on the parten page)
		System.out.println(driver.getCurrentUrl());
		
		//Goto the newly opened tab
		Set<String>set=driver.getWindowHandles();
		//We Swicth using list function becasuse the set function does not have get function
		List<String>list=new ArrayList<String>(set);
		driver.switchTo().window(list.get(1));
		
		//This will print the current url we switched
		System.out.println(driver.getCurrentUrl());
		
		//Print the title of the page
	    System.out.println(driver.getTitle());
	    
	    //Close the parent window
	    driver.switchTo().window(list.get(0));
	    System.out.println(driver.getCurrentUrl());
	    driver.close();
	    
	    //Close the child window
	    list.clear();
	    Set<String>set1=driver.getWindowHandles();
	    list.addAll(set1);
	    driver.switchTo().window(list.get(0));
	    System.out.println(driver.getCurrentUrl());
	    
	    
	    //Click on the Muiltiple windows button
	    driver.get("https://letcode.in/windows");
	    driver.findElement(By.xpath("//button[@id='multi']")).click();
	    Set<String>see=driver.getWindowHandles();
	   Iterator<String> mm=see.iterator();
	   
	   while (mm.hasNext()) {
		  
		   driver.switchTo().window(mm.next());
		  
		   System.out.println(driver.getTitle());
		
	}
		
		
		
		
		
		
		
		
		
		
	}

}
