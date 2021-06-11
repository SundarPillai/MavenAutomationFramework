package Academy;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.landingPage;
import resources.base;

public class Homepage extends base {
	
@Test
public void basePageNavigation() throws IOException, InterruptedException
{
	driver =initializeDriver();
	driver.get("http://qaclickacademy.com");
	Thread.sleep(5000);
	landingPage ls=new landingPage(driver);
	ls.cancelPopupmsg().click();
	landingPage l=new landingPage(driver);
	l.getLogin().click();
	
}
}
