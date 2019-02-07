package com.rohit.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class AllControlsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Need to handle 
		1. text box
		2. textArea
		3. Check box
		4. Drop down 
		5. Radio button
		6. Hyperlink */
		
		
		// For proxy 
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
		
		driver.get("http://softwaretesting-guru.blogspot.in/p/main-page.html");
		
		// Handle hyper link
		
		driver.findElement(By.linkText("Selenium Practice page")).click();
		
		// Handle text box
		driver.findElement(By.name("Name")).sendKeys("Selenium");
		
		// Handle Check box
		driver.findElement(By.name("subscribe")).click(); 
		
		// Handle textArea
		driver.findElement(By.name("comments")).sendKeys("Tutorials for Selenium");
		
		// handle dropdown
		/* Dropdown handle code is written in Select class that's why 
		we need to create select class object and used parameterised constructor*/
		new Select(driver.findElement(By.name("countries"))).selectByVisibleText("Argentina");
		
		// handle Radio button
		// Nothing was specified so we went for Xpath
		driver.findElement(By.xpath("//input[@value='bad']")).click();

	}

}
