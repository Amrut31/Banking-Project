package UtilClasses;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilityClass {

	public static WebElement expliciteWait(WebDriver driver, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		WebElement element1 = wait.until(ExpectedConditions.visibilityOf(element));
		
		return element1;
	}
	
	public static String getDataFromPropertyFile(String key) throws IOException
	{
		FileInputStream file = new FileInputStream("configuration\\config.properties");
		
		Properties prop = new Properties();
		prop.load(file);
		
		return prop.getProperty(key);
	}

}
