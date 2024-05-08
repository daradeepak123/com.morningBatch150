package seleniumLearn;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WinHandles {
	public static WebDriver driver;
	private static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

	public static void main(String[] args) throws InterruptedException {
		String clicklink = Keys.chord(Keys.CONTROL,Keys.ENTER);
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get(url);
		
		Thread.sleep(2000);		
		
		String parentWin=driver.getWindowHandle();
		System.out.println(parentWin);
		
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		
		System.out.println(links.size());
		
		
		for(WebElement ele:links)
		{
			//System.out.println(ele.getText());
			ele.sendKeys(clicklink);			
			
		}
		
		
		
		
		Set<String> tabs=driver.getWindowHandles();
		for(String s:tabs)
		{
			System.out.println(s);
			driver.switchTo().window(s);
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			if(driver.getTitle().contains("You"))
			{
				try
				{
				System.out.println(driver.getTitle());
				}
				catch(UnhandledAlertException e)
				{
					e.printStackTrace();
				}
			}
			
			
			
		}
		
		
		driver.quit();
		
		
		
	}

}
