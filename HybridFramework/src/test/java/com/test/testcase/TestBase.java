package com.test.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.main.page.HomePage;
import com.main.page.MyAccountPage;

public class TestBase {
	public WebDriver driver;
	HomePage homepage;
	protected MyAccountPage MyAccount;
	
	@FindBy(id = "username")
	protected WebElement username;

	@FindBy(id = "password")
	protected WebElement password;

	@FindBy(xpath = "//*[@id='post-12']/div/div/form/p[3]/input[3]")
	protected WebElement ClickLoginButton;
	
	@FindBy(xpath=".//*[@id='post-12']/div/div/p[1]/strong")
	protected WebElement HomeUserName;

	@BeforeClass
	public void setup(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://test1.absofttrainings.com/");
		homepage = PageFactory.initElements(driver, HomePage.class);
		
	}
	@AfterClass
	public void teardown(){
		driver.close();
	}
}
