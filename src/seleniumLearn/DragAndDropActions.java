package seleniumLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropActions {
	public static WebDriver driver;
	private static String url="https://the-internet.herokuapp.com/drag_and_drop";

	public static void main(String[] args) throws InterruptedException {

		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get(url);
		
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		
		act.contextClick(driver.findElement(By.xpath("(//a)[2]"))).build().perform();
		
		WebElement drag=driver.findElement(By.xpath("//div[@id='column-a']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='column-b']"));
		
		
		act.dragAndDrop(drag, drop).build().perform();
		
		
		driver.quit();
		

	}

}
