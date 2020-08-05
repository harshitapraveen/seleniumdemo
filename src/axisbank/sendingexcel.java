package axisbank;


	import java.io.File;
	import java.io.FileInputStream;
	import org.apache.poi.xssf.usermodel.XSSFCell;
    import org.apache.poi.xssf.usermodel.XSSFRow;
    import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	
	public class sendingexcel
	{

	public static String getCellValue(String sheetName, int rowNum, int colNum) {
	String CellValue = null;
	try{
	  File file = new File("C:\\excelinput\\ExcelInput.xlsx");
	  FileInputStream source = new FileInputStream(file);
	  XSSFWorkbook workbook = new XSSFWorkbook(source);
	  XSSFSheet sheet = workbook.getSheet(sheetName);
	  XSSFRow row = sheet.getRow(rowNum);
	  XSSFCell cell = row.getCell(colNum);
	  CellValue = cell.getStringCellValue();
	  workbook.close();
	  }

	  catch (Exception e)
	  {
	   e.printStackTrace();

	  }
	  return CellValue;
	  }

	}
