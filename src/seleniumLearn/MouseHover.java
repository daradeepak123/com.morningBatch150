package seleniumLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static WebDriver driver;
	private static String url="https://www.browserstack.com/guide/selenium-webelement-commands";

	public static void main(String[] args) throws InterruptedException {

		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get(url);
		
		Thread.sleep(2000);

		Actions act=new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//button[text()='Developers']"))).build().perform();
		
		act.scrollToElement(driver.findElement(By.xpath("(//span[text()='Selenium Webdriver'])[1]"))).build().perform();
		
		
	}

}
