package com.rohit.july18;

import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadDataFromExcel {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		
		
		FileInputStream fis= new FileInputStream("C:\\Users\\admin\\Desktop\\TeasCase.xlsx");
		XSSFWorkbook my_xlsx_workbook= new XSSFWorkbook(fis);
		
		
		XSSFSheet my_worksheet = my_xlsx_workbook.getSheetAt(1);
		Iterator<Row> rowIterator = my_worksheet.iterator();
		rowIterator.next();
		
		StringBuffer msg=new StringBuffer(100);
		
		while(rowIterator.hasNext()) {
			Row row = rowIterator.next(); 
			
			//Read Rows from Excel document       
			Iterator<Cell> cellIterator = row.cellIterator();//Read every column for every row that is READ
			
			int i=0;
			while(cellIterator.hasNext()) { 
				i++;
				Cell cell = cellIterator.next();
				switch(cell.getCellTypeEnum()) { 
				
				case STRING: //handle string columns
					msg=msg.append(cell.getStringCellValue()).append("@@@");

					break;

				case NUMERIC: //handle string columns
					if(i==2){
						msg=msg.append(Double.valueOf(cell.getNumericCellValue()).intValue()).append("@@@");
					}else{
						msg=msg.append(Double.valueOf(cell.getNumericCellValue())).append("@@@");
					}
					break;

				}

			}

		}
		System.out.println(msg);
		String line=msg.toString();
		String arr[]=line.split("@@@");
		String raLoginUserID=arr[0];
		//System.out.println(raLoginUserID.substring(raLoginUserID.indexOf("."), raLoginUserID.length()-1).length());
		
		if((raLoginUserID.substring(raLoginUserID.indexOf("."), raLoginUserID.length()).length()-1)!=2){
			System.out.println();
			System.out.println(raLoginUserID.concat("0"));
		}else{
			System.out.println(raLoginUserID);
		}
		
		/*if(raLoginUserID.contains(".")){
			System.out.println(raLoginUserID);
		}else{
		System.out.println(raLoginUserID.concat(".00"));
		}*/
		/*Iterator<Row> itr=hs.iterator();

		itr.next();
		while(itr.hasNext()){
			Row row = itr.next(); //Read Rows from Excel document       
			Iterator<Cell> cellIterator = itr.cellIterator();//Read every column for every row that is READ

			
		System.out.println(itr.next().getCell(1).getStringCellValue());
		System.out.println(itr.next().getCell(1).getStringCellValue());
		
		}*/

	}

}
