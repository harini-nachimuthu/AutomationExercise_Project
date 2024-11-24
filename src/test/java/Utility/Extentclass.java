package Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentclass {
	
	public static ExtentReports getreport() {
		String path="C:\\Users\\harin\\eclipse-workspace\\Automation_excercise\\Extent_report_Generation\\index.html";
		ExtentSparkReporter reporter =new ExtentSparkReporter(path);
		reporter.config().setReportName("Automation Exercise");
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setDocumentTitle("Test Automation Documentation: Coverage of 26 Test Cases");

		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Environment System info path : ",path);
		return extent;
		
	}

}
