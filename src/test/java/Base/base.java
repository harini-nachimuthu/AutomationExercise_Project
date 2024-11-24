package Base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utility.utils;

public class base extends utils{
	
  @BeforeMethod
  @Parameters({"browser","url"})
  public void beforetest(String browser,String url) {
	  launchingbrowserandurl(browser,url);
  }
  
  @AfterMethod
  public void aftertest() {
	  if (driver != null) {
	  quitbrowser();
	  }
  }
  
}
