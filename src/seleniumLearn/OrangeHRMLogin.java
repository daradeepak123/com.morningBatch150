package seleniumLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHRMLogin {
	public static WebDriver driver;
	private static String url="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

	public static void main(String[] args) throws InterruptedException {

		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(2000);
		String creds[]=new String[2];
		creds[0]="Admin";
		creds[1]="admin123";
		WebElement unameTB=driver.findElement(By.xpath("//input[@name='username']"));
		WebElement pwdTB=driver.findElement(By.xpath("//input[@name='password']"));
		WebElement loginBTN=driver.findElement(By.xpath("//button"));

		unameTB.clear();
		unameTB.sendKeys(creds[0]);
		pwdTB.clear();
		pwdTB.sendKeys(creds[1]);
		loginBTN.click();
		Thread.sleep(2000);
		WebElement txtEle=driver.findElement(By.xpath("//h6"));
		String txt=txtEle.getText();
		if(txt.equals("Dashboard"))
		{
			System.out.println("test case pass");
		}
		else
		{
			System.out.println("Test case fail");
		}
		
		driver.findElement(By.xpath("//button[@title='Assign Leave']")).click();
		
		
		driver.quit();
	}

}
