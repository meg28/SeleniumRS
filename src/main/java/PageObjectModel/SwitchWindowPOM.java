package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchWindowPOM {

	WebDriver driver;

	public SwitchWindowPOM(WebDriver driver) {
		this.driver = driver;
	}

	By opwind = By.xpath("//button[@onclick = 'openWindow()']");
	By btext = By.xpath("//button[text()='NO THANKS']");
	By ved = By.linkText("VIDEOS");

	public WebElement opwindow() {
		return driver.findElement(opwind);
	}

	public WebElement butntext() {
		return driver.findElement(btext);
	}

	public WebElement veds() {
		return driver.findElement(ved);
	}

}
