package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	
	// TODO Auto-generated method stub
	public WebDriver driver;
	public WebDriver initializeDriver() throws IOException 
	{
	Properties prop = new Properties();
	FileInputStream fis = new FileInputStream("E:\\Seleniumjava\\E2EProjects\\src\\main\\java\\resources\\data.properties");
	prop.load(fis);
	String browsername = prop.getProperty("browser");
	//Note = we cannot use == when we extract value from a property
	
	if(browsername.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver.exe");  
          
        // Instantiate a ChromeDriver class.     
		 driver=new ChromeDriver();  
	}
	else if (browsername.equals("firefox"))
	{
		//System.setProperty("webdriver.firefox.driver", "C:\\Users\\User\\Downloads\\geckodriver.exe");  
		 driver=new FirefoxDriver(); 
           
	}
	else if (browsername.equals("IE"))
	{
		//System.setProperty("webdriver.IE.driver", "C:\\Users\\User\\Downloads\\IEdriver.exe");  
          
        // Instantiate a IE class.     
		 driver=new InternetExplorerDriver();
	
}
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
	return driver;
	}}

