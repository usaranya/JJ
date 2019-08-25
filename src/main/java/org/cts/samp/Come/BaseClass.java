package org.cts.samp.Come;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

	public class BaseClass {
		public static WebDriver driver;
		public static WebDriver launchUrl(String url)
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\eclipse-workspace\\AdRes\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(url);
			return driver;
			
		}
		public static void input(WebElement e,String value)
		{
			e.sendKeys(value);
		}
		public static void button(WebElement e)
		{
			e.click();	
		}
		public static void dDown(WebElement e,String value)
		{
		 Select s=new Select(e);
		s.selectByVisibleText(value);	
		}
		public static String getTxt(WebElement e)
		{
		    String t= e.getAttribute("value");
			return t;
		}
		public static void quitBrowser() {
			driver.quit();
		}
		public static String getData(int rn, int cn) throws IOException {
			File eLoc=new File("C:\\Users\\Shree\\eclipse-workspace\\AdRes\\excel\\Book1.xlsx");
			FileInputStream stream=new FileInputStream(eLoc);
			Workbook w=new XSSFWorkbook(stream);
			Sheet s=w.getSheet("Datas");
			Row r = s.getRow(rn);
			Cell c = r.getCell(cn);
			int d = c.getCellType();
			String name=  null;
			if(d==1)
			{
				name= c.getStringCellValue();
			}
			if(d==0)
			{
				if (DateUtil.isCellDateFormatted(c)) {
					name = new SimpleDateFormat("dd-MMM-yy").format(c.getDateCellValue());
					
				} else {
	               name = String.valueOf( (long)c.getNumericCellValue());
				}
				return name;
			}
			return name;
			}
		public static void writeData(int rn,int cn, String name) throws IOException {
			File eLoc1=new File("C:\\Users\\Shree\\eclipse-workspace\\AdRes\\excel\\Book2.xlsx");
			FileInputStream stream=new FileInputStream(eLoc1);
			Workbook w=new XSSFWorkbook(stream);
			Sheet s=w.getSheet("Datas1");
			Row r = s.createRow(rn);
			Cell c = r.createCell(cn);
			c.setCellValue(name);
			FileOutputStream o= new FileOutputStream(eLoc1);
			w.write(o);

		}
			
			
		}


