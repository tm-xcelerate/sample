package org.demo.sample.api.test.process;

import static org.junit.Assert.assertEquals;

import org.demo.sample.api.model.Message;
import org.demo.sample.api.process.Processor;
import org.demo.sample.api.test.data.TestData;
import org.junit.Test;

public abstract class AbstractProcessorTest implements ProcessorTest {

	abstract protected TestData getTestData();

	abstract protected Processor getProcessor();

	@Override
	@Test
	public void testToUpper() {
		for (Message message : this.getTestData().getMessages()) {
			Message processedMessage = this.getProcessor().toUpper(message);
			assertEquals("ID values not equal", message.getId(), processedMessage.getId());
			assertEquals("Name values not equal", message.getName().toUpperCase(), processedMessage.getName());
		}
	}
}
