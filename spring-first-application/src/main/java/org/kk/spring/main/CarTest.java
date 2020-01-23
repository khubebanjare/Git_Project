package org.kk.spring.main;

import org.kk.spring.beans.Customer;
import org.kk.spring.cfgs.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class CarTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Customer customer = context.getBean("customer", Customer.class);
		customer.buyCar();
		
		((AbstractApplicationContext) context).close();
	}

}
