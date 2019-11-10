package com.task.taskconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class TaskConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskConfigApplication.class, args);
	}

}
