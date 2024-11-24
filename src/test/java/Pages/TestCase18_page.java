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

public class TestCase18_page extends base{
  
	public TestCase18_page(WebDriver driver) {
		this.driver=driver;
		this.js=(JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver,Duration.ofSeconds(55));
	}
	
	@FindBy(xpath="//h2[normalize-space()='Category']")
	WebElement categoriesbtn;
	
	@FindBy(xpath="//a[normalize-space()='Women']")
	WebElement womenbtn;
	
	@FindBy(xpath="//a[normalize-space()='Dress']")
	WebElement dressbtn;
	
	@FindBy(xpath="//a[normalize-space()='Men']")
	WebElement menbtn;
	
	@FindBy(xpath="//a[normalize-space()='Jeans']")
	WebElement jeansbtn;
	
	public TestCase18_page Test18() {
		ifelsechecking(categoriesbtn);
		webelementclickbtn(womenbtn);
		webelementclickbtn(dressbtn);
		equalchecktext("Automation Exercise - Dress Products");
		webelementclickbtn(menbtn);
		webelementclickbtn(jeansbtn);
		equalchecktext("Automation Exercise - Jeans Products");
		return this;
	}
}
