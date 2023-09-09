package com.skandar.Etablissement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.skandar") // Include all relevant packages

public class NathalieApplication {

	public static void main(String[] args) {
		SpringApplication.run(NathalieApplication.class, args);
	}

}
