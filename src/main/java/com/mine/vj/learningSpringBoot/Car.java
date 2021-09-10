package com.mine.vj.learningSpringBoot;

import org.springframework.stereotype.Component;

@Component
public class Car {
	
	public Car() {
		System.out.println("car instantiated");
	}
	
	public void getCar() {
		System.out.println("Toyota car");
	}

}
