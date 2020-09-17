package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FramePOM {

	WebDriver driver;

	public FramePOM(WebDriver driver) {
		this.driver = driver;
	}

	By mouseH = By.id("mousehover");
	By iframe = By.tagName("iframe");
	By consulting = By.xpath("//*[text()= 'Consulting']");
	By button = By.xpath("//button[@class='btn btn-lg btn-teal btn-mw-150 border-radius-50 consultingGetQuoteBtn'][1]");
	By namee = By.name("name");
	By email = By.name("email");
	By ContactNo = By.name("contactNo");
	By Timezone = By.name("timezone");
	By city = By.name("city");
	By value = By.xpath("//input[@value='long']");
	By checkbox = By.xpath("//input[@type ='checkbox']");
	By submit = By.xpath("//button[@id ='form-submit']");
	By footermodal = By.xpath("//*[contains(text(),'Close')]");
	By Home = By.xpath("//*[contains(text(),'Home')]");
	By owlSta = By.xpath("//div[@class ='owl-stage']");
	By mentor = By.xpath("//a[@href = '#/mentorship']");

	By footer = By.xpath("//div[@class=' footer_top_agile_w3ls gffoot footer_style']");
	By apitesting = By.xpath("//a[@href='http://www.restapitutorial.com/']");

	public WebElement mouse() {
		return driver.findElement(mouseH);
	}

	public WebElement frame() {
		return driver.findElement(iframe);
	}

	public WebElement Consulting() {
		return driver.findElement(consulting);
	}

	public WebElement Button() {
		return driver.findElement(button);
	}

	public WebElement nameee() {
		return driver.findElement(namee);
	}

	public WebElement emailId() {
		return driver.findElement(email);
	}

	public WebElement ContactNum() {
		return driver.findElement(ContactNo);
	}

	public WebElement Timezonee() {
		return driver.findElement(Timezone);
	}

	public WebElement cityy() {
		return driver.findElement(city);
	}

	public WebElement valuee() {
		return driver.findElement(value);
	}

	public WebElement checkboxx() {
		return driver.findElement(checkbox);
	}

	public WebElement submitt() {
		return driver.findElement(submit);
	}

	public WebElement footermodall() {
		return driver.findElement(footermodal);
	}

	public WebElement Homee() {
		return driver.findElement(Home);
	}

	public WebElement owlStat() {
		return driver.findElement(owlSta);
	}

	public WebElement mentorsh() {
		return driver.findElement(mentor);
	}

	public WebElement footersec() {
		return driver.findElement(footer);
	}

	public WebElement restapitesting() {
		return driver.findElement(apitesting);
	}

}
