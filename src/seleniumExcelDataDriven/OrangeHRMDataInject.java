package seleniumExcelDataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHRMDataInject {
	public static WebDriver driver;
	private static String url;

	public static void main(String[] args) throws InterruptedException, IOException {

		File file=new File("c:\\demo\\employee.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet2");
		url=sheet.getRow(3).getCell(0).toString();
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(2000);
		String creds[]=new String[2];
		creds[0]=sheet.getRow(0).getCell(0).toString();
		creds[1]=sheet.getRow(0).getCell(1).toString();
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
