package seleniumLearn;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumBasics {

	public static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Desired browser");
		String browser=sc.next();
		
		if(browser.equals("ff"))
		{
		driver=new FirefoxDriver();
		}
		else if(browser.equals("edge"))
		{
		driver=new EdgeDriver();
		}
		else if(browser.equals("ie"))
		{
		driver=new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		
		
		String URLs[]=new String[5];
		
		
		URLs[0]="https://app.startinfinity.com/b/tsv2EqEAvSD/oU4fzWxSJas?view=4ce1d56a-4fe2-4283-883e-c4f802ed7b00";
		URLs[1]="https://www.selenium.dev/downloads/";
		URLs[2]="https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/WebDriver.html";
		URLs[3]="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		URLs[4]="https://github.com/";
		
		
		for(int i=0;i<URLs.length;i++)
		{
			
		driver.get(URLs[i]);
		
		Thread.sleep(2000);
		String cUrl=driver.getCurrentUrl();
		System.out.println(cUrl);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		
		}
		
		
		
		System.out.println(driver.getPageSource());
		
		
		driver.quit();		
	}

}
