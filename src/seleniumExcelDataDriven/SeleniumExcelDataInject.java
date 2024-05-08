package seleniumExcelDataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumExcelDataInject {
public static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		File file=new File("c:\\demo\\employee.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("URLs");

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
		
		
		int row=sheet.getLastRowNum()+1;
		System.out.println(row);
		String URLs[]=new String[row];
		
		for(int i=0;i<row;i++)
		{
			URLs[i]=sheet.getRow(i).getCell(0).toString();
		}
			
		
		for(int i=0;i<URLs.length;i++)
		{
			
		driver.get(URLs[i]);
		
		Thread.sleep(2000);
		String cUrl=driver.getCurrentUrl();
		System.out.println(cUrl);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		
		}
		
		
		
		//System.out.println(driver.getPageSource());
		
		
		driver.quit();	
	}

}
