package seleniumLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertsLearn {
	
		public static WebDriver driver;
		private static String url="https://the-internet.herokuapp.com/javascript_alerts";

		public static void main(String[] args) throws InterruptedException {

			driver=new FirefoxDriver();
			driver.manage().window().maximize();

			driver.get(url);

			Thread.sleep(2000);

			driver.findElement(By.xpath("(//button)[1]")).click();

			Thread.sleep(2000);
			
			driver.switchTo().alert().accept();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//button)[2]")).click();

			Thread.sleep(2000);
			
			driver.switchTo().alert().dismiss();
			
			Thread.sleep(2000);
			
			
			driver.findElement(By.xpath("(//button)[3]")).click();

			Thread.sleep(2000);

			System.out.println(driver.switchTo().alert().getText());
			
			driver.switchTo().alert().sendKeys("Hello");
			driver.switchTo().alert().accept();
			
			Thread.sleep(2000);
			
			
			
			driver.quit();
			
			
		}

	}


