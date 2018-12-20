package com.orson.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableAsync;
@EnableAsync
@SpringBootApplication
@EnableAutoConfiguration
@EnableConfigurationProperties
public class ProjectorsonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectorsonApplication.class, args);
	}

}

