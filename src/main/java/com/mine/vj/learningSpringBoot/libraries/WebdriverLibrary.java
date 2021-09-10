package com.mine.vj.learningSpringBoot.libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.bonigarcia.wdm.WebDriverManager;

@Configuration
public class WebdriverLibrary {

	@Bean
	@ConditionalOnProperty(name = "browser", havingValue = "chrome")
	public WebDriver getChromeDriver() {
		WebDriverManager.chromedriver().setup();
		return new ChromeDriver();

	}

	@Bean
	@ConditionalOnProperty(name = "browser", havingValue = "FF")
	public WebDriver getFFDriver() {
		WebDriverManager.firefoxdriver().setup();
		return new FirefoxDriver();

	}

}
