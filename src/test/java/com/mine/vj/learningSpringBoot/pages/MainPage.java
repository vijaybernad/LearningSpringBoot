package com.mine.vj.learningSpringBoot.pages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "env", havingValue = "qa")
public class MainPage extends BasePage {

	public MainPage() {
		System.out.println("In Main Page");
	}

	@Autowired
	private LoginPage loginPage;

	@Autowired
	private HomePage homePage;

	public void performLogin() {

		homePage.ClickLogin();
		loginPage.Login("sample", "Sample@12");
		loginPage.ClickLogin();
	}

}
