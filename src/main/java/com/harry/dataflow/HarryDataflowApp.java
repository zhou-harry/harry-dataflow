package com.harry.dataflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HarryDataflowApp {

	public static void main(String[] args) {
//		SpringApplication.run(HarryDataflowApp.class, args);
		SpringApplication application = new SpringApplication(HarryDataflowApp.class);
		application.setWebApplicationType(WebApplicationType.NONE);
		ConfigurableApplicationContext ctx = application.run(args);
	}

}
