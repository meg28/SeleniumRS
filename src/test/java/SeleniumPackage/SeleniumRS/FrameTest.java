package SeleniumPackage.SeleniumRS;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModel.FramePOM;
import Utility.Base;
import Utility.DataDriven;

public class FrameTest extends Base {

	public static Logger log = LogManager.getLogger(FrameTest.class.getName());
	
	String xlFilePath = "C:\\Users\\yes\\eclipse-workspace\\SeleniumRS\\DataDriven.xlsx"; 
	String sheetName = "testdata";
	

	@Test(dataProvider = "userFormData")
	public void framemethod(String name, String email, String numb, String Timez, String city)
			throws InterruptedException, IOException {

		driver = initializedriver();
		log.info("Driver initialized");

		FramePOM framepom = new FramePOM(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", framepom.mouse());

		System.out.println(framepom.frame().getSize());
		driver.switchTo().frame("iframe-name");
		log.info("Frames");

		// WebDriverWait wait = new WebDriverWait(driver,20);
		// wait.until(ExpectedConditions.)
		WebElement con = framepom.Consulting();
		js.executeScript("arguments[0].click()", con);
		log.info("Consulting");

		js.executeScript("arguments[0].scrollIntoView()", framepom.Button());
		log.info("Scroll");
		framepom.Button().click();
		log.info("FormStart");

		Thread.sleep(2000);
		log.info("Data provider values");
		System.out.println(name);
		System.out.println(email);
		System.out.println(numb);
		System.out.println(Timez);
		System.out.println(city);
		
		framepom.nameee().sendKeys(name);
		framepom.emailId().sendKeys(email);
		framepom.ContactNum().sendKeys(numb);
		framepom.Timezonee().sendKeys(Timez);
		framepom.cityy().sendKeys(city);

		framepom.valuee().click();

		framepom.checkboxx().click();
		framepom.submitt().click();
		log.info("Formend");

		Thread.sleep(2000);

		log.info("Modal Open");
		WebElement footerdrivermodal = framepom.footermodall();
		Thread.sleep(4000);
		footerdrivermodal.findElement(By.xpath("//*[contains(text(),'Close')]")).click();
		log.info("Modal Close");

		footerdrivermodal.findElement(By.xpath("//*[contains(text(),'Home')]")).click();

		Thread.sleep(2000);

		js.executeScript("arguments[0].scrollIntoView()", framepom.owlStat());
		System.out.println("Home1");

		Thread.sleep(2000);
		framepom.mentorsh().click();

		log.info("clicked on Mentorship");

		driver.switchTo().defaultContent();
		log.info("Back to window from frames");
		WebElement footerdriver = framepom.footersec();
		log.info("footerSection");
		footerdriver.findElement(By.xpath("//a[@href='http://www.restapitutorial.com/']")).click();
		log.info("RestAPI Page open");
		Thread.sleep(2000);
		driver.navigate().back();
		log.info("FrameTest Done");
		// footerdriver.findElement(By.xpath("//a[@href='https://www.imbrokenlink.com/']")).click();

	}

	
	 @DataProvider
	    public Object[][] userFormData() throws Exception
	    {
	        return DataDriven.testData(xlFilePath, sheetName);
	    }


	 
	/*@DataProvider
	public Object[][] getData() {
		Object data[][] = new Object[2][5];
		data[0][0] = "Meg";
		data[0][1] = "email";
		data[0][2] = "8523669785";
		data[0][3] = "Timezone";
		data[0][4] = "Thane";

		data[1][0] = "Aak";
		data[1][1] = "emailq";
		data[1][2] = "123456789";
		data[1][3] = "Timez";
		data[1][4] = "Mumbai";

		return data;
*/	}
