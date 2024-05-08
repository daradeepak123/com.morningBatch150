package seleniumLearn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsImpli {
	public static WebDriver driver;
	private static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

	public static void main(String[] args) throws InterruptedException {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("hello");
		

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("hello");
		
		

		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button")));
		
		
		
	}

}
