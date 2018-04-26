package functionalComponent;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xlsReader {
	

	XSSFWorkbook wkbook= null;
	XSSFRow row;
	
	
	
	public  String getCellData(XSSFSheet sheetName, int rnum, int cnum){
		String celltext= "";
		
		row= sheetName.getRow(rnum);
		XSSFCell cell= row.getCell(cnum);
		
		if (cell==null){
			return "";
		}
		if (cell.getCellType()==cell.CELL_TYPE_NUMERIC ){
			celltext= String.valueOf(cell.getNumericCellValue());
		}else if(cell.getCellType()==cell.CELL_TYPE_STRING){
			celltext= cell.getStringCellValue();
		}
		return celltext;
		
	}

	public int getRowCount(XSSFSheet shName) {
		
		int rowcnt=0;
		
		rowcnt= shName.getPhysicalNumberOfRows();
		System.out.println("Row count"+rowcnt);
		return rowcnt;
	}
	
	 public int getColCount(XSSFSheet sheetName){
			int colcnt=0;
			colcnt= sheetName.getRow(0).getPhysicalNumberOfCells();
			System.out.println("column count "+colcnt);
			return colcnt;
		}

}

