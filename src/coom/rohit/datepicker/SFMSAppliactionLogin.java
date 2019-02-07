package coom.rohit.datepicker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class SFMSAppliactionLogin {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");	
		
		FirefoxProfile profile = new FirefoxProfile();
		 profile.setPreference("network.proxy.type", 0);    
		
		 WebDriver driver = new FirefoxDriver(profile);
		 
		 driver.manage().window().maximize();
	   
	    
	   // https://172.16.105.13:8443/sfms/login/passlogin
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    
	    driver.get("https://172.16.105.13:8443/sfms/login/passlogin");
	    driver.findElement(By.id("uaiUserId")).clear();
	    driver.findElement(By.id("uaiUserId")).sendKeys("venu");
	    driver.findElement(By.id("uaiUserNodeAddrs")).clear();
	    driver.findElement(By.id("uaiUserNodeAddrs")).sendKeys("VBNK0000001");
	    driver.findElement(By.id("uaiSmartCardSl")).click();
	    driver.findElement(By.xpath(".//*[@id='uaiSmartCardSl']")).clear();
	    driver.findElement(By.xpath(".//*[@id='uaiSmartCardSl']")).sendKeys("Abc@1234");
	    //driver.findElement(By.id("uaiSmartCardSl")).clear();
	   // driver.findElement(By.id("uaiSmartCardSl")).sendKeys("Abc@1234");
	    driver.findElement(By.id("passLogin")).click();

	}

}
