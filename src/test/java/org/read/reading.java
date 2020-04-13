package org.read;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class reading {

	public static void main(String[] args) throws IOException{
		File f=new File("E:\\Myworkouts\\proj1\\excel\\Book1.xlsx");
		FileInputStream s1 =new FileInputStream(f);
	    Workbook w= new XSSFWorkbook(s1);
		Sheet s=w.getSheet("");
		Row r=s.getRow(2);
		Cell c=r.getCell(0);
		System.out.println(c);
		

	}

}
