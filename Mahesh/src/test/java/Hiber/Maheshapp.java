package Hiber;


import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Maheshapp
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
  public void login() throws InterruptedException 
  
  {
	   
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.bt.bms:id/no_bt"))).click();
	  
	  driver.findElementByAndroidUIAutomator("new UiSelector().text(\"YOU\")").click();
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.bt.bms:id/login_bt"))).click();
 
      wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.bt.bms:id/edtemail"))).sendKeys("mahe_308@yahoo.co.in");
	  
      wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.bt.bms:id/edtpass"))).sendKeys("mahesh4592");
	  
      wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.bt.bms:id/signin"))).click();
	  
      wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.bt.bms:id/action_icon"))).click();
	  
      wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.bt.bms:id/action_text"))).click();
	  
      wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.bt.bms:id/yes_bt"))).click();
	  
	  Thread.sleep(3000);
	  
	  driver.sendKeyEvent(AndroidKeyCode.BACK);
	  
  }
   
   
  @Test
  
  public void ticket() throws InterruptedException
  {
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.bt.bms:id/no_bt"))).click();
	  
	  driver.findElementByAndroidUIAutomator("new UiSelector().text(\"MOVIES\")").click();
	   
	  Thread.sleep(3000);
	  
	  List<WebElement> list1=driver.findElements(By.id("com.bt.bms:id/EventPoster"));
	  
	  TouchAction t=new TouchAction(driver);
	  
	  t.tap(list1.get(2)).perform();
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.bt.bms:id/book_bt"))).click();
	  
	  Thread.sleep(2000);
	  
	  driver.findElementByAndroidUIAutomator("new UiSelector().text(\"10\")").click();
	  
	  Thread.sleep(2000);
	  
	  driver.findElementByAndroidUIAutomator("new UiSelector().text(\"PVR: Cyberabad, Inorbit Mall\")").click();
	  
	  Thread.sleep(3000);
	  
	  driver.findElementByAndroidUIAutomator("new UiSelector().text(\"10:50\")").click();
	  
	  Thread.sleep(1000);
	  
	  driver.findElementByAndroidUIAutomator("new UiSelector().text(\"available\")").click();
	  
	  driver.findElementByAndroidUIAutomator("new UiSelector().text(\"2\")").click();
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.bt.bms:id/txvDone"))).click();
	  
	  driver.sendKeyEvent(AndroidKeyCode.HOME);
	  
  }
	  /*
	  List<WebElement> list2=driver.findElements(By.className("android.widget.ImageView"));
	  
	  Thread.sleep(8000);
	  
	  list2.get(15).click();
			  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.bt.bms:id/txvDone"))).click();
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.bt.bms:id/paynow"))).click();
	  
	  Thread.sleep(3000);
	  
	  driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Debit/Credit Card\")").click();
	  
	  Thread.sleep(2000);
	   
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.bt.bms:id/card_no_et"))).sendKeys("4263971921001307");
	  
      wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.bt.bms:id/expiry_date_et"))).click();
      
      driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Jan\")").click();
      
      driver.findElementByAndroidUIAutomator("new UiSelector().text(\"2016\")").click();
	  
      wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.bt.bms:id/cvv_et"))).sendKeys("100");
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.bt.bms:id/user_name_et"))).sendKeys("xyz");
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.bt.bms:id/set_bt"))).click();
	  
	  driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Done\")").click();
	  
	  */
	  

     @AfterMethod
     public void afterMethod()
	  {
    	 driver.quit();
	  }
     
}
