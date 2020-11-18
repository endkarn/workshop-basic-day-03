package com.example.demosping;

import com.example.demosping.account.Account;
import com.example.demosping.account.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Profile;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DemoSpingApplication {

	@Autowired AccountRepository repository;

//	@Profile({"testing"})
	@PostConstruct
	public void initialDataForTesting() {
		Account somkiat = new Account();
		somkiat.setAccountId(1);
		somkiat.setAccountName("Somkiat for test");
		somkiat.setAge(100);
		repository.save(somkiat);
	}

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
