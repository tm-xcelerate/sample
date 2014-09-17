package org.demo.sample.impl.process;

import org.demo.sample.api.process.Processor;
import org.demo.sample.api.test.data.TestData;
import org.demo.sample.api.test.process.AbstractProcessorTest;
import org.demo.sample.impl.config.DefaultTestConfig;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DefaultTestConfig.class, loader = AnnotationConfigContextLoader.class)
public class DefaultProcessorTest extends AbstractProcessorTest {

	@Autowired
	TestData testData;

	@Autowired
	Processor processor;

	@Override
	protected TestData getTestData() {
		return this.testData;
	}

	@Override
	protected Processor getProcessor() {
		return this.processor;
	}
}
