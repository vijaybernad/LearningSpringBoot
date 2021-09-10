package com.mine.vj.learningSpringBoot.steps;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	@Autowired
	public WebDriver webDriver;
	
	@Before
	public void InitalizeTest(Scenario scenario)
	{
		webDriver.navigate().to("http://eaapp.somee.com/");
	}
	
	@After
	public void TearDown(Scenario scenario) {
		if(scenario.isFailed()) {
			//screenshot logic goes here
		}
		webDriver.quit();
	}
}
