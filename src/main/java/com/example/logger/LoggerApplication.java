package com.example.logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class LoggerApplication {

	private static final Logger logger = LoggerFactory.getLogger(LoggerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LoggerApplication.class, args);

		logger.info("Hello info");
	}
}
