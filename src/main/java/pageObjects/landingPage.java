package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingPage {
	
	//click on login link in homepage
	
	public WebDriver driver;
	
	By signin = By.xpath("//*[text()='Login']");
	By cancelpopup = By.xpath("//*[@id=\'homepage\']/div[4]/div[2]/div/div/div/span/div/div[6]/div/div/button");

	public landingPage(WebDriver driver) {
	
		this.driver=driver;
	}

	public WebElement cancelPopupmsg()
	{
		return driver.findElement(cancelpopup);
	}
	public WebElement getLogin()
	{
		return driver.findElement(signin);
	}
	

	
	
}
