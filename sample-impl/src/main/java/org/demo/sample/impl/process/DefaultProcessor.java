package org.demo.sample.impl.process;

import org.demo.sample.api.model.Message;
import org.demo.sample.api.process.Processor;
import org.demo.sample.impl.model.DefaultMessage;

public class DefaultProcessor implements Processor {

	@Override
	public Message toUpper(Message message) {
		return new DefaultMessage(message.getId(), message.getName().toUpperCase());
	}

}
