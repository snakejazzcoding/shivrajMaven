package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {
	public static ExtentReports extent;
	public static ExtentReports getReports() {
		
		
		
		//ExtentSparkReporter--> title, theme, 
		//ExtentRports---> setup
		String path = "C:\\Users\\admin\\eclipse-workspace\\shivrajFramework\\Reports\\index.html";
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Automation Test Report");
		reporter.config().setReportName("Dss test report");
		reporter.config().setTheme(Theme.DARK);
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Project Name", "Dss Test");
		extent.setSystemInfo("Tool", "Selenium WebDriver");
		extent.setSystemInfo("QA", "ABC");
		return extent;
		
		
	}

}
