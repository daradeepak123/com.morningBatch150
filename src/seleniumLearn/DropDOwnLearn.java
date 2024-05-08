package seleniumLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDOwnLearn {
	public static WebDriver driver;
	private static String url="https://the-internet.herokuapp.com/dropdown";

	public static void main(String[] args) throws InterruptedException {

		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get(url);
		
		Thread.sleep(2000);
		
		WebElement d=driver.findElement(By.xpath("//select"));
		
		Select dw=new Select(d);
		
		dw.selectByVisibleText("Option 1");
		
		Thread.sleep(2000);
		dw.selectByValue("2");
		
		Thread.sleep(2000);
		dw.selectByIndex(1);
		
		
	}

}
