package com.rohit.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class GetNameProperty3 {

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
				
				
				// launchig browser
				
				WebDriver driver = new FirefoxDriver(cap);
				
				// Maximise browser
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
				
				driver.get("https://www.google.com/advanced_search");
				
				// Get first text box name property
				
				String nameAttribute=driver.findElement(By.id("_dKg")).getAttribute("name");
				
				System.out.println(nameAttribute);
				
				driver.quit();
				

	}

}
