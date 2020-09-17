package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeClass;

import SeleniumPackage.SeleniumRS.FrameTest;


public class Base {
	
	protected static WebDriver driver;
	
	public static Logger log = LogManager.getLogger(FrameTest.class.getName());
	
	@BeforeClass
	public WebDriver initializedriver() throws IOException {
		
		
		FileInputStream fs = new FileInputStream("C:\\Users\\yes\\eclipse-workspace\\SeleniumRS\\data.properties");
		Properties pr = new Properties();
		pr.load(fs);
		
		
		 String browsername = pr.getProperty("browser").trim();
	log.info("Chrome Browser selected");
		 if(browsername.equals("chrome"))
		 {
			 System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
		 }
		
		 else if (browsername.equals("firefox"))
		 {
			 driver = new FirefoxDriver();
		 }
		
		//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // for all the TC
		
		String urll = pr.getProperty("url").trim();
		driver.get(urll);
		driver.manage().window().maximize();
		return driver;
	
	}

	/*
	 * @AfterClass public void BaseMethodCloseApp() { driver.quit();
	 * 
	 * }
	 */
	
	

	public void getscreenshotpath(String TestCaseName) throws IOException //, WebDriver driver
	{
		TakesScreenshot tc = (TakesScreenshot) driver;
		File img = tc.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\screenshots\\"+TestCaseName+".png";
		FileHandler.copy(img, new File(destinationFile));
	}
	
}
