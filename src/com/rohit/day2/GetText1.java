package com.rohit.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class GetText1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		/*1.Get text
		2. Get Tool Tip Text
		3. Get property of the control
		4. Get value from the text box
		5. Get back ground colour of the control*/
		
		
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
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//get particular text
		//use xpath only when any text doesn't have any attribute 
		
		String name=driver.findElement(By.xpath(".//*[@id='customers']/tbody/tr[3]/td[2]")).getText();
		
		System.out.println(name);

	}

}
