package com.rohit.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class GetBackGroundColor5 {

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
				
				//  time out
				driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
				
				driver.get("https://www.google.co.in/webhp?tab=ww&ei=Y5NUWb2JA4i38QXKv6LIBg&ved=0ENUuCAY&gfe_rd=cr");
				
				// Get Back ground color  it will return as RGB value
				
				String backCor=driver.findElement(By.name("btnK")).getCssValue("background-color");
				
				System.out.println(backCor);
				// quite the browser
				
				driver.quit();
				

	}

}
