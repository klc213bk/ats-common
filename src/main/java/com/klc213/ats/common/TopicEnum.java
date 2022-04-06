package com.klc213.ats.common;

public enum TopicEnum {
	TWS_ACCOUNT("TWS.ACCOUNT"),
	TWS_ACCOUNT_DOWNLOAD_END("TWS_ACCOUNT_DOWNLOAD_END"),
	TWS_ACCOUNT_VALUE("TWS_ACCOUNT_VALUE"),
	TWS_PORTFOLIO("TWS_PORTFOLIO"),
	TWS_ACCOUNT_TIME("TWS_ACCOUNT_TIME");
	
	private final String topic;
	
	TopicEnum(String topic) {
		this.topic = topic;
	}

	public String getTopic() {
		return topic;
	}
	
	
}
