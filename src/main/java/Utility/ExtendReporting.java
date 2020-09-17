package Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import com.aventstack.extentreports.reporter.configuration.Theme;

@SuppressWarnings("deprecation")
public class ExtendReporting {
	static ExtentReports extent;
	
	static ExtentHtmlReporter extentHTML;

	public static ExtentReports StartReport() {
		extentHTML = new ExtentHtmlReporter(System.getProperty("user.dir") + "\\reports\\report1.html");
	//	extentHTML.loadConfig(System.getProperty("user.dir") + "\\extent-config.xml");
		extent = new ExtentReports();
		extent.attachReporter(extentHTML);
		extent.setSystemInfo("Environment", "Automation Testing");
		extent.setSystemInfo("User Name", "Meghna Thapliyal");
		extentHTML.config().setDocumentTitle("Title of the Report Comes here");
		extentHTML.config().setReportName("Name of the Report Comes here");
	//	extentHTML.config().setTestViewChartLocation(ChartLocation.TOP);
		extentHTML.config().setTheme(Theme.STANDARD);
		return extent;
	}

}
