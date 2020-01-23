package org.kk.spring.beans;

import org.springframework.stereotype.Component;

@Component
public class BugatiCar implements Car {

	public BugatiCar() {
		System.out.println("BugatiCar.BugatiCar()");
	}
	
	@Override
	public void making() {
		System.out.println("BugatiCar.making()");
	}

}
