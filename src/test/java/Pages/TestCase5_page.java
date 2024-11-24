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

public class TestCase5_page extends base{
	
	@FindBy(xpath="//a[normalize-space()='Home']")
	WebElement homebtn;
	
	@FindBy(xpath="//div/div/div/div[2]/div/ul/li[4]/a")
	WebElement homesignupbtn;

	@FindBy(xpath="//body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/h2[contains(text(),'New User Signup!')]")
	WebElement newusersignup;
	
	@FindBy(xpath="//input[@name='name']")
	WebElement signupname;
	
	@FindBy(xpath="(//input[@name='email'])[2]")
	WebElement signupemail;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	WebElement signupbtn;
	
	@FindBy(xpath="//p[normalize-space()='Email Address already exist!']")
	WebElement emailpresent;
	
	public TestCase5_page(WebDriver driver) {
		this.driver=driver;
		this.js=(JavascriptExecutor) driver;
		wait=new WebDriverWait(driver,Duration.ofSeconds(55));
		PageFactory.initElements(driver, this);
	}

	public TestCase5_page Test5() {
		webelementclickbtn(homebtn);
		equalchecktext("Automation Exercise");
		webelementclickbtn(homesignupbtn);
		ifelsechecking(newusersignup);
		webelementsendkey(signupname,"Harini");
		webelementsendkey(signupemail,"Harini@gmail.com");
		webelementclickbtn(signupbtn);
		ifelsechecking(emailpresent);
		return this;
	}
	
	@FindBy(xpath="(//input[@name='email'])[1]")
	WebElement loginemail;
	
	@FindBy(xpath="(//input[@name='password'])[1]")
	WebElement loginpassword;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement Loginbtn;
	
	@FindBy(xpath="//li[contains(.,'Logged in as Harini')]")
	WebElement loggedinas;
	
	public TestCase5_page Test5_1() {
		webelementsendkey(loginemail,"Harini@gmail.com");
		webelementsendkey(loginpassword,"password@12345");
		webelementclickbtn(Loginbtn);
		ifelsechecking(loggedinas);
		return this;
	}
}
