package com.mine.vj.learningSpringBoot.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/java/com/mine/vj/learningSpringBoot/features"},
		glue ="com.mine.vj.learningSpringBoot.steps" 
		)
public class TestRunner extends AbstractTestNGCucumberTests {

}
