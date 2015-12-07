package Hiber;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Discover 
{
    private AndroidDriver driver;
	
	private WebDriverWait wd;
	  @BeforeMethod
	  public void beforeMethod() 
	  {
			 try
			  {
			  
			  DesiredCapabilities cap=new DesiredCapabilities();
			  
			  cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
			  
			  cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Andriod device");
			  
			  cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"500");
			  
	          cap.setCapability(MobileCapabilityType.APP_PACKAGE,"com.bt.bms");
			  
			  cap.setCapability(MobileCapabilityType.APP_ACTIVITY,"com.bt.bms.activities.SplashActivity");
			  
			  driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
			   
			  wd=new WebDriverWait(driver,5);
			  
			  }
			  
			  catch(Exception e)
			  {
				  System.out.println("the exception raised="+e);
			  }
			  
			  
		  }
	  
	  @Test
	  public void discover() throws InterruptedException
	  {
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.bt.bms:id/no_bt"))).click();
		  
		  driver.findElementByAndroidUIAutomator("new UiSelector().text(\"DISCOVER\")").click();
		  
		  Thread.sleep(3000);
		  
		  driver.findElementByAndroidUIAutomator("new UiSelector().text(\"COMING SOON\")").click();
		  
          Thread.sleep(5000);
		  
		  driver.findElementByAndroidUIAutomator("new UiSelector().text(\"KNOW MORE\")").click();
		  
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.bt.bms:id/btnWantToSee"))).click();
		  
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.bt.bms:id/yes_bt"))).click();
		  
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.bt.bms:id/edtemail"))).sendKeys("mahe_308@yahoo.co.in");
		  
	      wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.bt.bms:id/edtpass"))).sendKeys("mahesh4592");
	      
	      Thread.sleep(2000);
		  
	      wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.bt.bms:id/signin"))).click();
	      
	      Thread.sleep(2000);
	      
	      wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.bt.bms:id/btnWantToSee"))).click();
	      
	      Thread.sleep(2000);
	      
	      driver.sendKeyEvent(AndroidKeyCode.BACK);
	      
	      Thread.sleep(3000);
	      
	      driver.findElementByAndroidUIAutomator("new UiSelector().text(\"YOU\")").click();
	      
	      wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.bt.bms:id/action_icon"))).click();
		  
	      wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.bt.bms:id/action_text"))).click();
		  
	      wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.bt.bms:id/yes_bt"))).click();
		  
		  Thread.sleep(2000);
		  
		  driver.sendKeyEvent(AndroidKeyCode.BACK);
		  
		  
		  
	  }
	  
	  @AfterMethod
	     public void afterMethod()
		  {
	    	 driver.quit();
		  }
  }

