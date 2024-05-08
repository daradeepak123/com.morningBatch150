package seleniumLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox {
	public static WebDriver driver;
	private static String url="https://the-internet.herokuapp.com/checkboxes";

	public static void main(String[] args) throws InterruptedException {

		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get(url);
		
		Thread.sleep(2000);
		
		boolean fChkBx=driver.findElement(By.xpath("//input[1]")).isSelected();
		if(!fChkBx)
		{
		driver.findElement(By.xpath("//input[1]")).click();
		}
		boolean fChkBx2=driver.findElement(By.xpath("//input[2]")).isSelected();
		if(!fChkBx2)
		{
			driver.findElement(By.xpath("//input[2]")).click();
		}
		
		
		
	}

}
