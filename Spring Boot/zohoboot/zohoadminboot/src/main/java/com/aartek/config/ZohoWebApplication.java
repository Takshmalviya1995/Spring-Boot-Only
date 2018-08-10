package com.aartek.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.aartek")
@EntityScan("com.aartek.model")
@EnableJpaRepositories("com.aartek")
public class ZohoWebApplication {
	public static void main(String[] args) {
      SpringApplication.run(ZohoWebApplication.class, args);
      System.out.println("Hello World");
	}
}
