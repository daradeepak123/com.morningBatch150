package seleniumLearn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementsFinding {
	public static WebDriver driver;
	private static String url="https://the-internet.herokuapp.com";

	public static void main(String[] args) throws InterruptedException {

		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get(url);
		
		Thread.sleep(2000);
		
		WebElement AB=driver.findElement(By.xpath("//a[starts-with(text(),'A/')]"));
		
		String txt=AB.getText();
		System.out.println(txt);
		
		WebElement AB1=driver.findElement(By.xpath("//a[starts-with(text(),'Ad')]"));
		
		txt=AB1.getText();
		System.out.println(txt);
		
		
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		
		System.out.println(links.size());
		
		if(links.size()==46)
		{
		for(WebElement ele:links)
		{
			System.out.println(ele.getText());
		}
		
		}
		
		
		driver.quit();
		
		
		
	}

}
