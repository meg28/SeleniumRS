package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SuggestiveDropdownPOM {

	WebDriver driver;

	public SuggestiveDropdownPOM(WebDriver driver) {
		this.driver = driver;
	}
	
	By texttyp = By.xpath("//input[@type ='text']");
	
	public WebElement texttype()
	{
		return driver.findElement(texttyp);
	}
}
