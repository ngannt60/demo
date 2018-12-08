package testcase;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;	

import pageobject.registerpage;

public class register {
	WebDriver driver;
	@Test
	public void firstTestcase() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ingan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.lazada.vn");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
//		registerpage reg = new registerpage(driver);
//		reg.txtphone.sendKeys("01234");
//		reg.txtpass.sendKeys("123456");
//		reg.selectmonth.click();
//		reg.txtmonth.click();
//		reg.selectday.click();
//		reg.txtday.click();
//		reg.selectyear.click();
//		reg.txtyear.click();
//		reg.selectsex.click();
//		reg.txtsex.click();
//		reg.txtname.sendKeys("Ngân");
//		reg.txtemail.sendKeys("ngan.gmail");
//		reg.btnRegis.click();
		
//		Actions ac = new Actions(driver);
//		ac.dragAndDropBy(reg.btnslide, 380, 40).build().perform();
		
		if(title.equals("Shopping online - Buy online on Lazada.vn")) {
			WebElement btnLogin = driver.findElement(By.xpath("//div[@id=\"anonLogin\"]//a"));
			btnLogin.click();
			
		}else {
			driver.navigate().to("https://tiki.vn/");
		}
		//driver.close();
	}
}
