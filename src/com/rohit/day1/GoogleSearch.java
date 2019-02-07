package com.rohit.day1;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class GoogleSearch {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		/*FirefoxProfile p = new FirefoxProfile();
        p.setPreference("webdriver_firefox_port", 7056);
		System.setProperty("webdriver.firefox.marionette", "C:/geckodriverWin64/geckodriver.exe");
		
		// For launching the browser
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		// Entert Url
		
		driver.get("http://www.google.co.in");*/
		
		String PROXY = "172.29.24.8:8080";

		org.openqa.selenium.Proxy proxy = new org.openqa.selenium.Proxy();
		proxy.setHttpProxy(PROXY)
		     .setFtpProxy(PROXY)
		     .setSslProxy(PROXY);
		System.setProperty("webdriver.firefox.marionette", "C:/geckodriverWin64/geckodriver.exe");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.PROXY, proxy);
		WebDriver driver = new FirefoxDriver(cap);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("http://www.google.co.in");
		
		// Handle text box
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
		
		// handle button 
		
		driver.findElement(By.name("btnG")).click();
			/*URL url = new URL( "http", "localhost", 4444, "/wd/hub" );
			DesiredCapabilities capabilities =DesiredCapabilities.firefox();
			System.out.println("1");
			capabilities.setJavascriptEnabled(true);
			System.out.println("2");
			WebDriver driver = new RemoteWebDriver(url,capabilities);
			System.out.println("4");
			driver.get("http://www.google.com");*/
		

	}

}
