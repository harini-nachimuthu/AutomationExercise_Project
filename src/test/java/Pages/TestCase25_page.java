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

public class TestCase25_page extends base{
  
	public TestCase25_page(WebDriver driver) {
		this.driver=driver;
		this.js=(JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver,Duration.ofSeconds(55));
	}
	
	@FindBy(xpath="//a[normalize-space()='Home']")
	WebElement homebtn;
	
	@FindBy(xpath="//h2[.='Subscription']")
	WebElement subscriptiontext;
	
	@FindBy(xpath="//a[@id='scrollUp']")
	WebElement scrollupbtn;
	
	@FindBy(xpath="//h2[.='Full-Fledged practice website for Automation Engineers']")
	WebElement homepagetext;
	
	public TestCase25_page Test25() {
		webelementclickbtn(homebtn);
		equalchecktext("Automation Exercise");
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		ifelsechecking(subscriptiontext);
		webelementclickbtn(scrollupbtn);
		ifelsechecking(homepagetext);
		return this;
	}
}
