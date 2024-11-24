package Pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.base;

public class TestCase4_page extends base {
  
	@FindBy(xpath="//a[.=' Logout']")
	WebElement logoutbtn;
	
	public TestCase4_page(WebDriver driver) {
		this.driver=driver;
		this.js=(JavascriptExecutor)driver;
		wait=new WebDriverWait(driver,Duration.ofSeconds(55));
		PageFactory.initElements(driver, this);
	}



	public TestCase4_page Test4() {
		webelementclickbtn(logoutbtn);
		equalchecktext("Automation Exercise - Signup / Login");
		return this;
	}
}
