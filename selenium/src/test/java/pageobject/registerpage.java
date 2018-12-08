package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registerpage {
	@FindBy (css = "div.mod-input-phone>input")
	public WebElement txtphone;
	@FindBy (xpath="//span[@id=\"nc_2_n1z\"]")
	public WebElement btnslide;
	@FindBy (xpath ="//div[@class=\"mod-input mod-input-password mod-login-input-password mod-input-password\"]//input")
	public WebElement txtpass;
	
	@FindBy (xpath="//span[@id=\"month\"]")
	public WebElement selectmonth;
	@FindBy (xpath="//ul[@class=\"next-menu-content\"]//li[@value=\"2\"]")
	public WebElement txtmonth;
	
	@FindBy (xpath="//span[@id=\"day\"]")
	public WebElement selectday;
	@FindBy (xpath="//ul[@class=\"next-menu-content\"]//li[@value=\"5\"]")
	public WebElement txtday;
	
	@FindBy (xpath="//span[@id=\"year\"]")
	public WebElement selectyear;
	@FindBy (xpath="//ul[@class=\"next-menu-content\"]//li[@value=\"2012\"]")
	public WebElement txtyear;
	
	@FindBy (xpath="//div[@class=\"mod-gender\"]")
	public WebElement selectsex;
	@FindBy (xpath="//ul[@class=\"next-menu-content\"]//li[@value=\"female\"]")
	public WebElement txtsex;
	
	@FindBy (xpath= "//div[@class=\"mod-input mod-login-input-name mod-input-name\"]//input")
	public WebElement txtname;
	@FindBy (xpath= "//div[@class=\"mod-input mod-login-input-email mod-input-email\"]//input")
	public WebElement txtemail;
	
	@FindBy (xpath= "//div[@class=\"mod-login-btn\"]//button[@type=\"submit\"]")
	public WebElement btnRegis;
	public registerpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
