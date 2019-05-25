package com.slide.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringDemoApplication.class, args);
		String exampleString = (String) applicationContext.getBean("example");
		System.out.println("output --> " + exampleString );
	}

}
