package seleniumLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {
	public static WebDriver driver;
	private static String url="https://the-internet.herokuapp.com/iframe";

	public static void main(String[] args) throws InterruptedException {

		driver=new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get(url);

		Thread.sleep(2000);
		
		String str=driver.findElement(By.xpath("//h3")).getText();
		System.out.println(str);

		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//body[@id='tinymce']")).clear();
		driver.findElement(By.xpath("//body[@id='tinymce']")).sendKeys(str);
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		driver.quit();

	}

}
