package com.mine.vj.learningSpringBoot.steps;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;

import com.mine.vj.learningSpringBoot.models.TestUserDetails;
import com.mine.vj.learningSpringBoot.models.UserDetails;
import com.mine.vj.learningSpringBoot.pages.HomePage;
import com.mine.vj.learningSpringBoot.pages.LoginPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginSteps {

	@Autowired
	public HomePage homePage;

	@Autowired
	public LoginPage loginPage;
	
	@Autowired
	public TestUserDetails testuserDetails;

	@Given("I navigate to the login page")
	public void iNavigateToTheLoginPage() {
		homePage.ClickLogin();
		testuserDetails.setUserDetails(new UserDetails("sample", "Sample@12"));
	}

	

	@And("I click login button")
	public void iClickLoginButton() {
		loginPage.ClickLogin();
	}

	@Then("I should see the userform page")
	public void iShouldSeeTheUserformPage() {
		 Assert.assertEquals(homePage.isEmployeeDetailsExist() , true);

	}

}
