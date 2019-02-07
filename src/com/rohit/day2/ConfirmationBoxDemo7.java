package com.rohit.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ConfirmationBoxDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// set proxy
				String PROXY = "172.29.24.8:8080";
				org.openqa.selenium.Proxy proxy = new org.openqa.selenium.Proxy();
				proxy.setHttpProxy(PROXY)
				     .setFtpProxy(PROXY)
				     .setSslProxy(PROXY);
				System.setProperty("webdriver.firefox.marionette", "C:/geckodriverWin64/geckodriver.exe");
				DesiredCapabilities cap = new DesiredCapabilities();
				cap.setCapability(CapabilityType.PROXY, proxy);
				
				
				// launching browser
				
				WebDriver driver = new FirefoxDriver(cap);
				
				// Maximise browser
				
				driver.manage().window().maximize();
				
				
				
				//  time out
				driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
				
				/*client site alert has no property but for server site we will have property*/
				
				
				
				// enter url
				driver.get("http://softwaretesting-guru.blogspot.in/p/blog-page.html");
				
				// Confirmation box
				
				driver.findElement(By.xpath(".//*[@id='sampleform']/table/tbody/tr[10]/td/input")).click();
				
				// cancle
				
				driver.switchTo().alert().dismiss();
				
				// ok  
				
				driver.switchTo().alert().accept();
				
				driver.close();

	}

}
