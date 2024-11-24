package Utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class utils {
	
	public static WebDriver driver;
	public WebDriverWait wait;
	public JavascriptExecutor js;
	
	public void launchingbrowserandurl(String browser,String url) {
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--disable-notifications");
			option.addArguments("--incognito");
//			option.addArguments("--headless");
			driver=new ChromeDriver(option);
		}else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions option=new FirefoxOptions();
			option.addArguments("--disable-notifications");
			option.addArguments("--incognito");
//			option.addArguments("--headless");
			driver=new FirefoxDriver(option);
		}else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			EdgeOptions option=new EdgeOptions();
			option.addArguments("--disable-notifications");
			option.addArguments("--incognito");
//			option.addArguments("--headless");
			driver=new EdgeDriver(option);
		}else {
			System.out.println("Invalid browser name so by default browser will run in chrome.....");
			WebDriverManager.chromedriver().setup();
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--disable-notifications");
			option.addArguments("--incognito");
//			option.addArguments("--headless");
			driver=new ChromeDriver(option);
		}
		
		js=(JavascriptExecutor) driver;
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
	}
	
	public void closebrowser() {
		driver.close();
	}
	
	public void quitbrowser() {
		driver.quit();
	}

	public void webelementclickbtn(WebElement ele) {
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
	}
	
	public void webelementsendkey(WebElement ele,String text) {
		wait.until(ExpectedConditions.visibilityOf(ele));
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		ele.sendKeys(text);
	}
	
	public void ifelsechecking(WebElement ele) {
		if(wait.until(ExpectedConditions.visibilityOf(ele))!=null) {
			System.out.println("Text is present - "+ele.getText());
		}
		else {
			System.out.println("Text is not present - "+ele.getText());
		}
	}
	
	public void equalchecktext(String expected) {
		if(driver.getTitle().equals(expected)) {
			System.out.println("Yes it landed in correct page.. - "+driver.getTitle());
		}else {
			System.out.println("No it not landed in correct page.. - "+driver.getTitle());
		}
	}
	
	public String takescreenshot(String browser,String screenshotname) throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String time=new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
		String filename=browser+"_"+screenshotname+"_"+time;
		String path="C:\\Users\\harin\\eclipse-workspace\\Automation_excercise\\Screenshots\\"+filename+ ".png";
		File des=new File(path);
		FileUtils.copyFile(src, des);
		return path;
	}
}
