package com.test.testcase;

import org.testng.annotations.Test;

public class HomePageTest extends TestBase{

	
	@Test
	public void testHomePage(){
		homepage.testHomePageLink().ClickLoginButton("testuser1", "testpwd1");
	}
}
