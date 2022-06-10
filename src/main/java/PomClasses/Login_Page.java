package PomClasses;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilClasses.UtilityClass;

public class Login_Page extends UtilityClass{

	WebDriver driver;
	
	@FindBy(xpath = "(//div[contains(@class,'btn51Btn')])[1]")
	private WebElement loginButton;
							
	@FindBy(xpath = "//input['@id=login_email1']")
	private WebElement email;
	
	@FindBy(xpath = "(//div[@class='absolute-center btn51ParentDimension'])[1]")
	private WebElement continue1;
	
	@FindBy(xpath = "//input[@id='login_password1']")
	private WebElement password;
	
	@FindBy(xpath = "//div[@class='col l12 leps592LoginButton']")
	private WebElement submitButton;
	
	public Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
	
	public void enterEmail() throws IOException
	{
		expliciteWait(driver, email);
		email.sendKeys(getDataFromPropertyFile("email"));
	}
	
	public void clickOnContinue()
	{
		expliciteWait(driver, continue1);
		continue1.click();
	}
	
	public void enterpassword() throws IOException
	{
		expliciteWait(driver, password);
		password.sendKeys(getDataFromPropertyFile("password"));
	}
	
	public void clickOnSubmitButton()
	{
		expliciteWait(driver, email);
		submitButton.click();
	}
	
	public void enterPin() throws IOException
	{		
		String pin =  getDataFromPropertyFile("pin");
		
		char[] digit = pin.toCharArray();
		
		expliciteWait(driver, driver.findElement(By.xpath("(//input[@type='number'])[1]")));
		
		for(int i=1; i<=digit.length; i++)
		{
			driver.findElement(By.xpath("(//input[@type='number'])["+i+"]")).sendKeys(String.valueOf(digit[i-1]));
		}
	}
	
	
	
	
	
	
	
}
