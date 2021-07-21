package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public static final String URL = "http://shop.demoqa.com/";
	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;

	}

}
