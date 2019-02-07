package com.rohit.july18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ReadData {
	
		// WebDriver driver;
	 // private String baseUrl;

	  
	  
		public void setup() throws Exception{
		  /*String PROXY = "172.29.24.8:8080";
			org.openqa.selenium.Proxy proxy = new org.openqa.selenium.Proxy();
			proxy.setHttpProxy(PROXY)
			     .setFtpProxy(PROXY)
			     .setSslProxy(PROXY);
			System.setProperty("webdriver.firefox.marionette", "C:/geckodriverWin64/geckodriver.exe");
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability(CapabilityType.PROXY, proxy);
			
			
			// launching browser
			
			WebDriver driver = new FirefoxDriver(cap);	 
			//String  baseUrl = "https://cp.sync.com/login";
			driver.get("https://cp.sync.com/login");
		    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		    */
		    ArrayList<ArrayList<Object>> sheet=new ArrayList<ArrayList<Object>>();
		    		//readExcelData2();
		    sheet =readExcelData2();
		  System.out.println(((ArrayList<Object>) sheet.get(1))); 
		  System.out.println(((ArrayList<Object>) sheet.get(3))); 
		  
		 
		  
		  System.out.println(((ArrayList<Object>) sheet.get(1)).get(0).toString());
		  System.out.println(((ArrayList<Object>) sheet.get(1)).get(1).toString());
		  System.out.println(((ArrayList<Object>) sheet.get(1)).get(2).toString());
		  
		  NumberFormat formatter = new DecimalFormat("#0.00");
		  double number = (double) ((ArrayList<Object>) sheet.get(1)).get(3);
		  
		  System.out.println(formatter.format(number));
		  System.out.println(((ArrayList<Object>) sheet.get(1)).get(4).toString());
		  System.out.println(((ArrayList<Object>) sheet.get(1)).get(5).toString());
		  System.out.println(((ArrayList<Object>) sheet.get(1)).get(6).toString());
		 
		  NumberFormat formatter1 = new DecimalFormat("#0");
		  
		  double number1 = (double) ((ArrayList<Object>) sheet.get(1)).get(7);
		  
		  System.out.println(formatter1.format(number1));
		  System.out.println(((ArrayList<Object>) sheet.get(1)).get(8).toString());
		  System.out.println(((ArrayList<Object>) sheet.get(1)).get(9).toString());
		  System.out.println(((ArrayList<Object>) sheet.get(1)).get(10).toString());
		  System.out.println(((ArrayList<Object>) sheet.get(1)).get(11).toString());
		  
		  double number2 = (double) ((ArrayList<Object>) sheet.get(1)).get(12);
		  System.out.println(formatter1.format(number2));
		  
		  
		  double number4 = (double) ((ArrayList<Object>) sheet.get(3)).get(0);
		  
		  System.out.println(formatter.format(number4));
		  
		  System.out.println(((ArrayList<Object>) sheet.get(3)).get(1).toString());
		  System.out.println(((ArrayList<Object>) sheet.get(3)).get(2).toString());
		  System.out.println(((ArrayList<Object>) sheet.get(3)).get(3).toString());
		  System.out.println(((ArrayList<Object>) sheet.get(3)).get(4).toString());
		  System.out.println(((ArrayList<Object>) sheet.get(3)).get(5).toString());
		  
		  double number5 = (double) ((ArrayList<Object>) sheet.get(5)).get(0);
		  
		  System.out.println(formatter.format(number5));
		  
		  System.out.println(((ArrayList<Object>) sheet.get(5)).get(1).toString());
		  System.out.println(((ArrayList<Object>) sheet.get(5)).get(2).toString());
		  
		  double number6 = (double) ((ArrayList<Object>) sheet.get(5)).get(3);
		  
		  System.out.println(formatter1.format(number6));
		  
		  System.out.println(((ArrayList<Object>) sheet.get(5)).get(4).toString());
		  
		  double number7 = (double) ((ArrayList<Object>) sheet.get(5)).get(5);
		  
		  System.out.println(formatter1.format(number7));
		  
		  
		    //ArrayList<Object> password=readExcelData2(1);
		   // ArrayList<String> comment=readExcelData(2);
		   // System.out.println("size:"+username.size());
		   // System.out.println("passsize:"+password.size());
		    /*for(int i=0;i<username.size();i++){
		    	
		    	Thread.sleep(3000);
		    	driver.findElement(By.linkText("Log in")).click();
		    	Thread.sleep(3000);
		    	driver.findElement(By.id("text-auth-email")).sendKeys(username.get(i).toString());
			  
		    	driver.findElement(By.id("text-auth-password")).sendKeys(password.get(i).toString());
		    	
		    	// Handle Check box
				driver.findElement(By.xpath("html/body/div[3]/div/div/div/div[3]/div[3]/form/div[3]/label/input")).click(); 
			  
		    	driver.findElement(By.id("btn-auth-login")).click();
		    	
		    	//writeExcel(i,"pass");
		    	
		    	Thread.sleep(6000);
		    	
		    	driver.findElement(By.xpath("html/body/div[1]/nav/div/ul[2]/li[3]/a/div")).click();
		    	
		    	driver.findElement(By.xpath("html/body/div[1]/nav/div/ul[2]/li[3]/ul/li[11]/a")).click();
		    	
		    	
		    	 
		    	Thread.sleep(5000);
		    	
		    	//driver.findElement(By.linkText("Log in")).click();
		    } */
			 
			  
			 
		}
	  
		private ArrayList<ArrayList<Object>> readExcelData2() throws Exception {
			  
			  FileInputStream fis= new FileInputStream("C:\\Users\\admin\\Desktop\\Pasc008Test.xlsx");
				XSSFWorkbook my_xlsx_workbook= new XSSFWorkbook(fis);
				
				
				XSSFSheet my_worksheet = my_xlsx_workbook.getSheetAt(0);
				Iterator<Row> rowIterator = my_worksheet.iterator();
				
				ArrayList<ArrayList<Object>> list=new ArrayList<ArrayList<Object>>();
				
				while(rowIterator.hasNext()){
					
					
					Row row = rowIterator.next(); 
					
					Iterator<Cell> cellIterator = row.cellIterator();//Read every column for every row that is READ
					ArrayList<Object> rowList=new ArrayList<Object>();
					int i=0;
					while(cellIterator.hasNext()) {
						i++;
						Cell cell=cellIterator.next();
					
					switch(cell.getCellTypeEnum())

					{
					case STRING: //handle string columns
						rowList.add(cell.getStringCellValue());
						
						System.out.println("ccdcd  ::  "+cell.getStringCellValue());
						break;

					case NUMERIC: //handle string columns
						
						
						rowList.add(Double.valueOf(cell.getNumericCellValue()));
						//System.out.println("xxxxx  ::  "+cell.getNumericCellValue());
						System.out.println("yyyyy  ::  "+Double.valueOf(cell.getNumericCellValue()));
						
						break;
						
				
					}
					}

					list.add(rowList);
					
				}
				
				System.out.println(list);
				
				return list;
			}


	


	private ArrayList<String> readExcelData(int i) throws Exception {
		  
		  FileInputStream fis= new FileInputStream("C:\\Users\\admin\\Desktop\\TeasCase.xlsx");
			XSSFWorkbook my_xlsx_workbook= new XSSFWorkbook(fis);
			
			
			XSSFSheet my_worksheet = my_xlsx_workbook.getSheetAt(0);
			Iterator<Row> rowIterator = my_worksheet.iterator();
			rowIterator.next();
			ArrayList<String> list=new ArrayList<String>();
			while(rowIterator.hasNext()){
				list.add(rowIterator.next().getCell(i).getStringCellValue());
			}
			
			System.out.println(list);
			
			return list;
		}


	public static void main(String args[]) throws Exception{
		  
		ReadData data= new ReadData();
		data.setup();
	  }
}
