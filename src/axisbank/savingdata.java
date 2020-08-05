package axisbank;


import java.io.File;
import java.io.FileInputStream;		
import java.io.FileOutputStream;		
import org.apache.poi.ss.usermodel.CellType;		
import org.apache.poi.xssf.usermodel.XSSFCell;	
import org.apache.poi.xssf.usermodel.XSSFRow;		
import org.apache.poi.xssf.usermodel.XSSFSheet;		
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
		
		public class savingdata  {
			
		public static String getCellValue(String sheetName, int rowNum, int colNum , String Name) 
		{                                                                 
		try
		{                                                
		File file = new File("C:\\exceloutput\\ExcelOutput.xlsx"); 
		FileInputStream source = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(source);
		XSSFSheet sheet = workbook.getSheet(sheetName);
		XSSFRow row = sheet.createRow(rowNum);
		XSSFCell cell = row.createCell(colNum);
		cell.setCellType(CellType.STRING);
		cell.setCellValue(Name);
		FileOutputStream Final1 = new FileOutputStream("C:\\exceloutput\\ExcelOutput.xlsx");
		workbook.write(Final1);
		Final1.close();
		workbook.close();                                 
		}
		catch (Exception e){
		e.printStackTrace(); 
		}
		return Name;     
		}
		}
