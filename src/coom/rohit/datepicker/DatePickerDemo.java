package coom.rohit.datepicker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DatePickerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		driver.get("http://jqueryui.com/datepicker/");
		 /* driver.switchTo().frame(0);
		  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		  //Click on textbox so that datepicker will come
		  driver.findElement(By.id("datepicker")).click();
		  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		  //Click on next so that we will be in next month
		  driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[2]/span")).click();
		  
		  DatePicker is a table.So navigate to each cell 
		   * If a particular cell matches value 13 then select it
		   
		  WebElement dateWidget = driver.findElement(By.id("ui-datepicker-div"));
		  List rows=dateWidget.findElements(By.tagName("tr"));
		  List columns=dateWidget.findElements(By.tagName("td"));*/
		  
		  /*for (WebElement cell: columns){
		   //Select 13th Date 
		   if (cell.getText().equals("13")){
		   cell.findElement(By.linkText("13")).click();
		   break;

	}
		  }
*/}
}
