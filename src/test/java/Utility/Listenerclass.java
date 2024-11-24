package Utility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Base.base;
import Utility.Extentclass;


public class Listenerclass extends base implements ITestListener{

	ExtentReports reports=Extentclass.getreport();
	ExtentTest test;
	String browsername=null;
	
	@Override
	public void onTestStart(ITestResult result) {
		
		ITestContext context=result.getTestContext();
		browsername=context.getCurrentXmlTest().getParameter("browser");
		
		Test testAnnotation = result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Test.class);
		
		if(testAnnotation!=null) {
			
			String testname=result.getMethod().getMethodName();
			String testdescription=testAnnotation.description();
			
			test=reports.createTest(testname).assignAuthor("Harini").assignDevice(browsername);
			
			test.log(Status.INFO, "Description: " + testdescription);
		}else {
			test=reports.createTest(result.getMethod().getMethodName()).assignAuthor("Unknown").assignDevice("Chrome").assignDevice("General");
		}
		test.log(Status.PASS, "Test Started: " + result.getMethod().getMethodName());
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test Success: "+result.getMethod().getMethodName());
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Test Failed : "+result.getMethod().getMethodName());
		
		String filepath=null;
		try {
			filepath=takescreenshot(browsername,result.getMethod().getMethodName());
			System.out.println(filepath);
		}catch(Exception e) {
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(filepath, result.getMethod().getMethodName());
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "Test Skipped"+result.getMethod().getMethodName());
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		test.log(Status.FAIL,"on Test Failed But Within Success Percentage :"+result.getMethod().getMethodName());
	}
	
//	@Override
//	public void onStart(ITestContext context) {
//		test.log(Status.INFO, "test Started : "+context.getName());
//	}
	@Override
	public void onFinish(ITestContext context) {
		reports.flush();
	}
}
