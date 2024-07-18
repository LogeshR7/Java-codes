package ep27;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListSelect {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		//Select the apple using visible text
		WebElement Fruit=driver.findElement(By.xpath("//select[@id='fruits']"));
		Select myfruit =new Select(Fruit);
		myfruit.selectByVisibleText("Apple");

		//Select your super hero's(And check is the lsit is multiple select)
		WebElement Hero=driver.findElement(By.xpath("//select[@id='superheros']"));
		Select myhero = new Select(Hero);
		System.out.println(myhero.isMultiple());
		myhero.selectByIndex(0);
		myhero.selectByValue("ta");

		//Select the last programming language and print all the options //Need to study loop for print all the option
		WebElement languvages= driver.findElement(By.xpath("//select[@ID='lang']"));
		Select Program=new Select(languvages);
		Program.selectByVisibleText("Python");
		WebElement sys=Program.getFirstSelectedOption();
		System.out.println(sys.getText());

		//Select India using value & print the selected value
		WebElement Country=driver.findElement(By.xpath("//select[@id='country']"));
		Select mycountry=new Select(Country);
		mycountry.selectByValue("India");
		WebElement priny=	mycountry.getFirstSelectedOption();
		System.out.println(priny.getText());




	}

}
