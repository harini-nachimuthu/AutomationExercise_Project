package Pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.base;

public class TestCase3_page extends base{
  
	@FindBy(xpath="//div/div/div/div[2]/div/ul/li[4]/a")
	WebElement homeloginbtn;
	
	@FindBy(xpath="//h2[normalize-space()='Login to your account']")
	WebElement loginvisible;
	
	@FindBy(xpath="(//input[@name='email'])[1]")
	WebElement loginemail;
	
	@FindBy(xpath="(//input[@name='password'])[1]")
	WebElement loginpassword;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement Loginbtn;
	
	@FindBy(xpath="//p[.='Your email or password is incorrect!']")
	WebElement incorrect;
	
	public TestCase3_page(WebDriver driver) {
		this.driver=driver;
		this.js=(JavascriptExecutor)driver;
		wait=new WebDriverWait(driver,Duration.ofSeconds(55));
		PageFactory.initElements(driver, this);
	}

	public TestCase3_page Test3() {
		webelementclickbtn(homeloginbtn);
		ifelsechecking(loginvisible);
		webelementsendkey(loginemail,"Hari@gmail.com");
		webelementsendkey(loginpassword,"password@123");
		webelementclickbtn(Loginbtn);
		ifelsechecking(incorrect);
		return this;
	}
}
