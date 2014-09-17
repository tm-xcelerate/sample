package org.demo.sample.impl.config;

import org.demo.sample.api.config.Config;
import org.demo.sample.api.process.Processor;
import org.demo.sample.impl.process.DefaultProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DefaultConfig implements Config {

	@Bean
	public Processor getProcessor() {
		return new DefaultProcessor();
	}
}
