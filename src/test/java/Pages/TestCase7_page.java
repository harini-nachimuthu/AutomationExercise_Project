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

public class TestCase7_page extends base{
  
	@FindBy(xpath="//a[.=' Test Cases']")
	WebElement testcasebtn;
	
	public TestCase7_page(WebDriver driver) {
		this.driver=driver;
		this.js=(JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver,Duration.ofSeconds(55));
	}

	public TestCase7_page Test7() {
		equalchecktext("Automation Exercise");
		webelementclickbtn(testcasebtn);
		equalchecktext("Automation Practice Website for UI Testing - Test Cases");
		return this;
	}
}
