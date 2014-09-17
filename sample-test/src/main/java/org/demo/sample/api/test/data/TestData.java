package org.demo.sample.api.test.data;

import java.util.List;

import org.demo.sample.api.model.Message;

public interface TestData {

	public static final String MESSAGES_JSON = "messages.json";

	List<Message> getMessages();

}
