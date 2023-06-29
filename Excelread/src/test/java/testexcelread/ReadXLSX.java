package testexcelread;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

public class ReadXLSX 
{
	@Test
	public void dataReadTest() throws IOException
	{
		File src = new File("C:\\Users\\vinay\\Desktop\\Read.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook xsf=new XSSFWorkbook(fis);
		XSSFSheet sheet=xsf.getSheetAt(0);
		System.out.println("The data in the box is ");
		//String entry1=sheet.getRow(1).getCell(1).getStringCellValue();
		//System.out.println(entry1);
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;i++)
			{
				String entry1=sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(entry1);
				xsf.close();
				j++;
				
			}
			
		}
	
		
	}
	


}
