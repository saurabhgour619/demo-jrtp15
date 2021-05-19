package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@SpringBootApplication
public class DemoCiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoCiApplication.class, args);
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		for(String beanName:beanDefinitionNames) {
			System.out.println(beanName);
		}
		UserService userServiceBean = context.getBean(UserService.class);
		userServiceBean.registerUser(new User(1, "Sourabh"));
	}

}
