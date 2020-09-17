package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MultiplePOM {

	WebDriver driver;

	public MultiplePOM(WebDriver driver) {
		this.driver = driver;
	}

	By checkbox2 = By.id("checkBoxOption2");
	By DisText = By.id("displayed-text");
	By HidText = By.id("hide-textbox");
	By mouseHov = By.xpath("//div[@class = 'mouse-hover']");
	By relo = By.linkText("Reload");
	By radio2 = By.xpath("//input[@value = 'radio2']");

	public WebElement checkboxx() {
		return driver.findElement(checkbox2);
	}

	public WebElement displayt() {
		return driver.findElement(DisText);
	}

	public WebElement hidt() {
		return driver.findElement(HidText);
	}

	public WebElement mouseHovr() {
		return driver.findElement(mouseHov);
	}

	public WebElement Reloa() {
		return driver.findElement(relo);
	}

	public WebElement radio() {
		return driver.findElement(radio2);
	}
}
