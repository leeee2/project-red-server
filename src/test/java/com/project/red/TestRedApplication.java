package com.project.red;

import org.springframework.boot.SpringApplication;

public class TestRedApplication {

	public static void main(String[] args) {
		SpringApplication.from(RedApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
