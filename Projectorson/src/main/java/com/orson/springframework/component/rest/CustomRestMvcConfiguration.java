package com.orson.springframework.component.rest;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

/**
 * @author Rohit Kulkarni. 20-Dec-2018 Projectorson
 *
 */
@Configuration
public class CustomRestMvcConfiguration implements RepositoryRestConfigurer {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
	//	config.disableDefaultExposure(); to hide default exposer of entity
	}
}