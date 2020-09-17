package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertPOM {

	WebDriver driver;

	public AlertPOM(WebDriver driver) {
		this.driver = driver;
	}

	By name = By.xpath("//input[@name = 'enter-name']");
	By alert = By.xpath("//input[@value ='Alert']");
	By confirm = By.xpath("//input[@value = 'Confirm']");

	public WebElement getname() {
		return driver.findElement(name);
	}

	public WebElement getalert() {
		return driver.findElement(alert);
	}

	public WebElement getconfirm() {
		return driver.findElement(confirm);
	}
}
