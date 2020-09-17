package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchTabPOM {

	WebDriver driver;

	public SwitchTabPOM(WebDriver driver) {
		this.driver = driver;
	}

	By tab = By.linkText("Open Tab");
	By course = By.linkText("Courses");

	public WebElement optab() {
		return driver.findElement(tab);
	}

	public WebElement cours() {
		return driver.findElement(course);
	}
}
