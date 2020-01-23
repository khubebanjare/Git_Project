package org.kk.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Customer {

	@Autowired
	@Qualifier("bugatiCar")
	private Car car;
	
	public void buyCar() {
		car.making();
	}
}
