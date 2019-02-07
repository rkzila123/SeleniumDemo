package com.rohit.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class AlertsDemo6 {

	public static void main(String[] args) throws InterruptedException {
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
		
		// Alert is an interface
		
		// enter url
		driver.get("https://www.makemytrip.com/bus-tickets/svr-travels-booking.html");
		
		// click on search option 
		
		driver.findElement(By.xpath(".//*[@id='search_new']/span")).click();
		
		// wait for some time
		Thread.sleep(3000);
		
		// handling alert
		
		
		System.out.println("asadd");
		//driver.switchTo().alert().accept(); // Predefined API
		System.out.println("dsfgdfd");
		//System.out.println(driver.switchTo().alert().getText());
		
		Alert alert = driver.switchTo().alert();
		System.out.println("fdhfgjdfh");
		System.out.println("Alert is :: "+alert.getText());
		
		String comingAlert=alert.getText();
		
		String expectedAlert="Please Select Leaving From.";
		
		if(expectedAlert.equalsIgnoreCase(comingAlert)){
			alert.accept();
			
			new Select(driver.findElement(By.name("selorigin"))).selectByValue("12439,Hudikeri");
		}
		
		//putting source
		
		// handle dropdown
				/* Dropdown handle code is written in Select class that's why 
				we need to create select class object and used parameterised constructor*/
				new Select(driver.findElement(By.name("selorigin"))).selectByValue("12439,Hudikeri");
		
		//driver.findElement(By.id("source")).sendKeys("Hyderabad");
		
		
		
		
		


	}

}
