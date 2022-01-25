package com.klc213.ats.common;

public enum TopicEnum {
	TWS_ACCOUNT("TWS.ACCOUNT");
	
	private final String topic;
	
	TopicEnum(String topic) {
		this.topic = topic;
	}

	public String getTopic() {
		return topic;
	}
	
	
}
