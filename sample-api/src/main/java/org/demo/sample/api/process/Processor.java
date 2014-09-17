package org.demo.sample.api.process;

import org.demo.sample.api.model.Message;

public interface Processor {

	Message toUpper(Message message);
}
