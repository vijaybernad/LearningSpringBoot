package com.mine.vj.learningSpringBoot;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mine.vj.learningSpringBoot.pages.MainPage;

@SpringBootTest
public class SpringBootTestNG extends AbstractTestNGSpringContextTests {

	@Autowired
	private WebDriver webDriver;

	@Autowired
	private MainPage mainPage;

	@Value("${app.url}")
	private String appURL;

	@BeforeTest
	protected void setupWebdriver() {
		webDriver.navigate().to(appURL);
	}

	@Test
	public void testLogin() {

		mainPage.performLogin();
	}
	
	@BeforeClass(alwaysRun = true)
	@BeforeSuite(alwaysRun = true)
	@Override
	protected void springTestContextPrepareTestInstance() throws Exception {
		super.springTestContextPrepareTestInstance();
	}
}
