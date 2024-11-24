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

public class TestCase10_page extends base{
  
	@FindBy(xpath="//a[normalize-space()='Home']")
	WebElement homebtn;
	
	@FindBy(xpath="//h2[.='Subscription']")
	WebElement subscriptiontext;
	
	@FindBy(xpath="//input[@id='susbscribe_email']")
	WebElement subscribemail;
	
	@FindBy(xpath="//button[@id='subscribe']")
	WebElement arrowbtn;
	
	@FindBy(id = "success-subscribe")
    WebElement successsubscribe;
	
	public TestCase10_page(WebDriver driver) {
		this.driver=driver;
		this.js=(JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver,Duration.ofSeconds(55));
	}
	
	public TestCase10_page Test10() {
		webelementclickbtn(homebtn);
		equalchecktext("Automation Exercise");
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		ifelsechecking(subscriptiontext);
		webelementsendkey(subscribemail,"Harini@gmail.com");
		webelementclickbtn(arrowbtn);
		ifelsechecking(successsubscribe);
		return this;
	}
}
