package com.klc213.ats.common;

public enum TopicEnum {
	TWS_ACCOUNT("TWS.ACCOUNT"),
	TWS_ACCOUNT_DOWNLOAD_END("TWS.ACCOUNT_DOWNLOAD_END"),
	TWS_ACCOUNT_VALUE("TWS.ACCOUNT_VALUE"),
	TWS_PORTFOLIO("TWS.PORTFOLIO"),
	TWS_ACCOUNT_TIME("TWS.ACCOUNT_TIME");
	
	private final String topic;
	
	TopicEnum(String topic) {
		this.topic = topic;
	}

	public String getTopic() {
		return topic;
	}
	
	
}
