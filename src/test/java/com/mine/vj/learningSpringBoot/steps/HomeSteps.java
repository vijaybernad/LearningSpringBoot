package com.mine.vj.learningSpringBoot.steps;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mine.vj.learningSpringBoot.models.TestUserDetails;
import com.mine.vj.learningSpringBoot.pages.LoginPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

public class HomeSteps {
	
	@Autowired
	public LoginPage loginPage;
	
	@Autowired
	public TestUserDetails testuserDetails;
	
	@And("I enter the following for Login")
	public void iEnterTheFollowingForLogin(DataTable table) {
//		List<String> data = table.asList();
//		loginPage.Login(data.get(2), data.get(3));
		
		loginPage.Login(testuserDetails.getUserDetails().getUserName(), testuserDetails.getUserDetails().getPassword());
	}

	

}
