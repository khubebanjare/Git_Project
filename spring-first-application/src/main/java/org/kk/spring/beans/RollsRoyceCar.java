package org.kk.spring.beans;

import org.springframework.stereotype.Component;

@Component
public class RollsRoyceCar implements Car {

	public RollsRoyceCar() {
		System.out.println("RollsRoyceCar.RollsRoyceCar()");
	}
	
	@Override
	public void making() {
		System.out.println("RollsRoyceCar.making()");
	}
}
