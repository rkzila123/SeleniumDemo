package com.rohit.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class GetDataFromTextBox4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Check for reset button whether it is clearing the text box */
		
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
		
		driver.findElement(By.id("_dKg")).sendKeys("Selenium");
		
		String testData=driver.findElement(By.id("_dKg")).getAttribute("value");
		System.out.println(testData);
		
		if(testData.isEmpty()){
			System.out.println("Test Case is fail ::::");
		}else{
			System.out.println("Test Case is pass ::::");
		}
		
		driver.quit();

	}

}
