package readDataFromExcelFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataExcel {

	public static void main(String[] args) throws IOException {

		File file=new File("c:\\demo\\employee.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		
		
		String str=sheet.getRow(0).getCell(0).toString();
		System.out.println(str);
		
		str=sheet.getRow(0).getCell(1).toString();
		System.out.println(str);
		
		
		
		int row=sheet.getLastRowNum()+1;
		int col=sheet.getRow(0).getLastCellNum();
		
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(sheet.getRow(i).getCell(j).toString()+"\t\t\t");
			}
			System.out.println();
		}
		
		
		
	}

}
