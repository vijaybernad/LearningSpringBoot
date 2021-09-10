package com.mine.vj.learningSpringBoot;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import com.mine.vj.learningSpringBoot.pages.MainPage;

@SpringBootTest
class LearningSpringBootApplicationTests {

	@Autowired
	private MainPage mainPage;

	@Value("${app.url}")
	private String environment;

	@Value("chrome,firefox,edge")
	private List<String> browsers;

	@Test
	void contextLoads() {
		System.out.println("=================" + environment);

		browsers.forEach(System.out::println);
		
		mainPage.performLogin();

	}

}
