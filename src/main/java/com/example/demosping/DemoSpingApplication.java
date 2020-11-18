package com.example.demosping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoSpingApplication {

	public static void main(String[] args) {
		//gradlew bootRun
		ConfigurableApplicationContext ctx
				= SpringApplication.run(DemoSpingApplication.class, args);

		for (String bean : ctx.getBeanDefinitionNames()) {
			System.out.println(bean);
		}
		System.out.println(ctx.getBeanDefinitionCount());
	}

}
