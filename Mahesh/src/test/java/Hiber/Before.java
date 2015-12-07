package Hiber;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Before 
{
	
	@BeforeSuite	 
	public void BeforeSuite() throws IOException, InterruptedException
	{
		Runtime.getRuntime().exec("cmd /c start C:\\Users\\MAHESH\\Desktop\\appiumStart.bat");
		
		Thread.sleep(7000);
	}
	
	 @AfterSuite
	 
		public void AfterSuite() throws IOException, InterruptedException
		{
			Runtime.getRuntime().exec("taskkill /IM cmd.exe");
			
			
		}
	  
}
	