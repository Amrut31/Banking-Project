package BaseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver getDriver(String browser) {

		WebDriver driver = null ;
		if(browser.equals("Chrome"))
		{
				
		}else if(browser.equals("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			System.setProperty("webdriver.getcko.driver", "src\\ main\\resources\\Browsers\\geckodriver-v0.31.0-win64");			
			
		    driver = new FirefoxDriver();	
		}
		 			
	     driver.get("https://groww.in/stocks/user/explore");	      
		 driver.manage().window().maximize();		 
		 return driver;
		 
	
		
	}

}
