package seleniumLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementMethodsLearn {

	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/forgot_password");
		
		WebElement txtBox=driver.findElement(By.xpath("//input[@id='email' and @type='text' and @name='email']"));
		
		boolean flag=txtBox.isDisplayed();
		flag&=txtBox.isEnabled();
	
		if(flag)
		{
			Dimension d=txtBox.getSize();
			System.out.println(d.height +" "+ d.width);
			Point p=txtBox.getLocation();
			System.out.println(p.x+ " "+p.y);
		}
		
		String text=driver.findElement(By.xpath("//label")).getText();
		if(text.equals("E-mail"))
		{
			txtBox.clear();
			txtBox.sendKeys("hello@gmail.com");

			String clr=driver.findElement(By.xpath("//button")).getCssValue("backgroundColor");
			System.out.println(clr);
			driver.findElement(By.xpath("//button")).click();
			
			String cURL=driver.getCurrentUrl();
			System.out.println(cURL);
			String msg=driver.findElement(By.xpath("//h1")).getText();
			if(msg.equals("Internal Server Error"))
			{				
				System.out.println("Test case pass");
			}
			else
			{
				System.out.println("testcase fail");
			}
		}
		
		//Thread.sleep(2000);
		
		driver.quit();
	}

}
