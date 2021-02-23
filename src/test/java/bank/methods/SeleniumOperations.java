package bank.methods;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumOperations 
{

	 public static WebDriver driver=null;
	
	 public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>();
	 
	// browser launch 
	public static Hashtable<String,Object> browserLaunch(Object[] inputParameters)
	{
		try
		{
		String strBrowserName=(String) inputParameters[0];
		String webDriverExePath=(String) inputParameters[1];
		
		if(strBrowserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver",webDriverExePath);
		    driver=new ChromeDriver();
			
		}
		else if(strBrowserName.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.geko.driver", webDriverExePath);
		    driver=new FirefoxDriver();
		}
		//	System.out.println("Test case pass");
		outputParameters.put("Status", "Pass");
		outputParameters.put("MESSAGE", "Action:Browser Launch,Input Given:"+inputParameters[0].toString());
		
		}
		catch(Exception e)
		{
		//	System.out.println("test case fail");
			
			outputParameters.put("Status", "FAIL");
			outputParameters.put("MESSAGE", "Action:Browser Launch,Input Given:"+inputParameters[0].toString());
		}
		
		return outputParameters;
	}
	
		// application launch
		public static void applicationLaunch(Object[] inputParameters)
		{
			try 
			{
			String strgUrl=(String) inputParameters[0];
			driver.get(strgUrl);
			outputParameters.put("Status", "Pass");
			outputParameters.put("MESSAGE", "Action: Application Launch, Input Given:"+inputParameters[0].toString());
			}
			catch(Exception e)
				{
				outputParameters.put("Status", "fail");
				outputParameters.put("MESSAGE", "Action: Application Launch, Input Given:"+inputParameters[0].toString());
				
				}
		}
	
		//  
		public static Hashtable<String,Object> sendKey(Object[] inputParameters)
		{
			try
			{
			String xpath=(String) inputParameters[0];
			String value=(String) inputParameters[1];

			WebElement obj1=driver.findElement(By.xpath(xpath));
			obj1.sendKeys(value);
			
			outputParameters.put("Status", "Pass");
			outputParameters.put("MESSAGE", "Action: SendKey, Input Given:"+inputParameters[1].toString());
			
			}
			
			catch(Exception e)
			{
				outputParameters.put("Status", "Fail");
				outputParameters.put("MESSAGE", "Action: SendKey, Input Given:"+inputParameters[1].toString());
				
			}
			
			return outputParameters;
		}
		
		// click
		public static Hashtable<String,Object> clcik(Object[] inputParameters)
		{
			try
			{
			String xpath=(String) inputParameters[0];
			WebElement obj2=driver.findElement(By.xpath(xpath));
			obj2.click();
			
			outputParameters.put("Status", "Pass");
			outputParameters.put("MESSAGE", "Action: click, Input Given:"+inputParameters[0].toString());
			
			}
			catch(Exception e)
			{
				outputParameters.put("Status", "fail");
				outputParameters.put("MESSAGE", "Action: click, Input Given:"+inputParameters[0].toString());
				
			}
			
			return outputParameters;
		}
		
}
	







