package seleniumLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BGclr {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		String clr=driver.findElement(By.xpath("//button")).getCssValue("color");
		System.out.println(clr);
		driver.quit();

	}

}
