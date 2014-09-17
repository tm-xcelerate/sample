package org.demo.sample.impl.config;

import org.demo.sample.api.test.config.TestConfig;
import org.demo.sample.api.test.data.TestData;
import org.demo.sample.impl.config.DefaultConfig;
import org.demo.sample.impl.test.data.DefaultTestData;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class DefaultTestConfig extends DefaultConfig implements TestConfig {

	@Override
	@Bean
	public TestData getTestData() {
		return new DefaultTestData();
	}

	@Bean
	public ObjectMapper getObjectMapper() {
		return new ObjectMapper();
	}
}
