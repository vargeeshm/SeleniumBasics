package com.main.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.testcase.TestBase;

public class MyAccountPage extends TestBase{
	public WebDriver driver;

	public void ClickLoginButton(String Lusername,String LPassword) {
		System.out.println("Login page:"+Lusername);
		driver.findElement(By.id("username")).sendKeys(Lusername);
		driver.findElement(By.id("password")).sendKeys(LPassword);
		driver.findElement(By.xpath("//*[@id='post-12']/div/div/form/p[3]/input[3]")).click();
//		username.sendKeys(Lusername);
//		password.sendKeys(LPassword);
//		ClickLoginButton.click();
		System.out.println("Login page finished");
	}
//	public boolean CheckLoginSuccssful(String username){
//		String HomeUser = HomeUserName.getText().toString();
//		if(username.equals(HomeUser)){
//			System.out.println("Congrats! Logged in ABSoftTrainings is successfully");
//			return true;
//		}
//		else{
//			System.out.println("Sorry!User Name or Password are incorrect");
//			return false;
//		}
//	}
}
