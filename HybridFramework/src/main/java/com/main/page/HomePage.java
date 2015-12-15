package com.main.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.test.testcase.TestBase;

public class HomePage extends TestBase{
	public WebDriver driver;
	
	@FindBy(xpath="//*[@id='menu-item-14']/a")
	private WebElement MyAccountLink;

	private MyAccountPage myaccount;

	public MyAccountPage testHomePageLink(){
		myaccount = new MyAccountPage();
		System.out.println("Testing 1");
		//driver.findElement(By.xpath("//*[@id='menu-item-14']/a")).click();
		MyAccountLink.click();
		System.out.println("Testing 2");
		return myaccount;
	}
}
