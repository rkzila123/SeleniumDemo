package com.sep;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class TicketTool {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		List<String> ticket= new ArrayList<String>();
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.marionette", "C:/geckodriverWin64/geckodriver.exe");	
		
		FirefoxProfile profile = new FirefoxProfile();
		 profile.setPreference("network.proxy.type", 0);    
		
		 WebDriver driver = new FirefoxDriver(profile);
		 
		 driver.manage().window().maximize();
	   
	    
	   // https://172.16.105.13:8443/sfms/login/passlogin
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    
	    driver.get("http://10.29.1.191:8080/sm9/index.do");
	    
	    driver.findElement(By.id("LoginUsername")).clear();
	    driver.findElement(By.id("LoginUsername")).sendKeys("ngrtgshelp1");
	    driver.findElement(By.id("LoginPassword")).clear();
	    driver.findElement(By.id("LoginPassword")).sendKeys("help@1234");
	    driver.findElement(By.id("loginBtn")).click();
	    Thread.sleep(3000);
	    
	   
	    
	    driver.findElement(By.xpath(".//*[@id='ext-gen76']")).click();
	    driver.findElement(By.xpath(".//*[@id='ROOT/Favorites and Dashboards/417']/a/span")).click();
	    Thread.sleep(10000);
	    
	    //int size = driver.findElements(By.tagName("iframe")).size();
	    
	   // System.out.println("size :" +size);
	    
	    driver.findElement(By.tagName("iframe"));
	    driver.switchTo().frame(1);
	    String pagetext=driver.findElement(By.id("__list")).getText();
	    
	    System.out.println(pagetext);
	    
	    String splitd[]=pagetext.split("request");
		
		for (int i = 0; i < splitd.length; i++) {
			
			splitd[i]=splitd[i].trim();
			if(splitd[i].startsWith("SD"))
			
			ticket.add(splitd[i].substring(0, 12));
					
			
		}
		
		for (String string : ticket) {
			
			System.out.println(string);
			
		}
		
		driver.close();
	    
	  
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
