package vtiger_crm_class_testcases;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Datadriven {
	
	public String getCellData(String path,String sheet,int row,int cell) throws Throwable
	{
	
		FileInputStream fis=new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
	String cellvalue = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	return cellvalue;
	}
	
	

}
