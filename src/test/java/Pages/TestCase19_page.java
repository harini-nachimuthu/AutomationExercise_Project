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

public class TestCase19_page extends base{
	public TestCase19_page(WebDriver driver) {
		this.driver=driver;
		this.js=(JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver,Duration.ofSeconds(55));
	}
	
	@FindBy(xpath="//a[@href='/products']")
	WebElement productbtn;
	
	@FindBy(xpath="//h2[normalize-space()='Brands']")
	WebElement brandvisible;
	
	@FindBy(xpath="//a[@href='/brand_products/Mast & Harbour']")
	WebElement mastharbourbtn;
	
	@FindBy(xpath="//h2[normalize-space()='Brand - Mast & Harbour Products']")
	WebElement productslisted;
	
	@FindBy(xpath="//a[@href='/brand_products/Allen Solly Junior']")
	WebElement allensollybrandtitle;
	
	@FindBy(xpath="(//a[@class='google-anno'])[1]")
	WebElement allensollypage;
	
	public TestCase19_page Test19() {
		webelementclickbtn(productbtn);
		ifelsechecking(brandvisible);
		webelementclickbtn(mastharbourbtn);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		js.executeScript("window.scrollTo(0,0);");
		equalchecktext("Automation Exercise - Mast & Harbour Products");
		ifelsechecking(productslisted);
		webelementclickbtn(allensollybrandtitle);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		js.executeScript("window.scrollTo(0,0);");
		equalchecktext("Automation Exercise - Allen Solly Junior Products");
		ifelsechecking(allensollypage);
		return this;
	}
}
