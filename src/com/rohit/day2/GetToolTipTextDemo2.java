package com.rohit.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class GetToolTipTextDemo2 {

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
				
				// Give url
				driver.get("https://www.google.co.in/search?q=advance+search&ie=utf-8&oe=utf-8&gws_rd=cr&ei=vpFUWYjLGcya8QWdo5sg");
				
				// get tooltip text always will have title attribute
				
				String tooltip= driver.findElement(By.id("logo")).getAttribute("title");
				
				System.out.println(tooltip);

	}

}
