package com.example.taskmanagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskmanagementApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(TaskmanagementApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TaskmanagementApplication.class, args);
		LOGGER.info("---TaskManagement EJECUTANDOSE---");
		LOGGER.info("---TaskManagement EJECUTANDOSE---");
	}


}
