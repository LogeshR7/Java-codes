package ep27;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RemitAndDrop{

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://remittance.ocs.org/remittance/public/login");


		//Login
		driver.findElement(By.id("login")).sendKeys("dosth");
		driver.findElement(By.id("password")).sendKeys("itsmedosth");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.manage().window().maximize();

		//Remit
		driver.findElement(By.linkText("Remit")).click();
		driver.findElement(By.linkText("Customer Code")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();

		//Benin Screening
		WebElement path =driver.findElement(By.xpath("//select[@name='beneficairy_screening']"));
		Select bene =new Select(path);
		bene.selectByValue("1");

		//driver.findElement(By.xpath("(//i[@class='i-Business-Mens'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@id='basic-addon2'])[5]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='checkmark'])[50]")).click();
		Thread.sleep(1000);
		//alert foe more tans
		driver.findElement(By.xpath("//button[text()='Yes']")).click();

		//remark
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//button[@class='close'])[2]")).click();

		//originator screening
		WebElement org =driver.findElement(By.xpath("//select[@name='orginator_screening']"));
		Select orgs = new Select(org);
		orgs.selectByIndex(1);

		//soi
		WebElement sqi=driver.findElement(By.xpath("//select[@name='sourceofincome']"));
		Select Income =new Select (sqi);
		Income.selectByIndex(5);

		//Originator
		driver.findElement(By.xpath("//input[@class='same_customer_as_orginator']")).click();


		//Purpose
		WebElement purpose=driver.findElement(By.xpath("//select[@name='Purpose']"));
		Select pur=new Select (purpose);
		pur.selectByIndex(3);
		
		//Transaction detail
		//Currency
		driver.findElement(By.xpath("//input[@placeholder='Enter Currency Code']")).sendKeys("MYR");
		
		//amount
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='0.00']")).sendKeys("2536255");
		//Because of nan issue
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Currency Code']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Enter Currency Code']")).sendKeys("MYR");
		
		//Exchange rate
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ex_rate']")).sendKeys("0.2770000000",Keys.TAB);
		
		//Payment TODO
		
		//Save
		Thread.sleep(1000);
		//Scroll
		WebElement sv=driver.findElement(By.xpath("(//button[text()='Save'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",sv);
		sv.click();
		
	





	}



}