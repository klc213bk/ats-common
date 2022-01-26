package com.klc213.ats.common.util;

import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class KafkaUtils {

	public static Producer<String, String> createProducer(String bootstrapServer, String clientId) {
		Properties props = new Properties();
		props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServer);
		props.put(ProducerConfig.CLIENT_ID_CONFIG, clientId);
		props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

		return new KafkaProducer<>(props);
	}
	
	public static String getTwsMktDataTopic(String symbol) {
		return "TWS.MKTDATA." + symbol;
	}
	public static Set<String> listTopics(String kafkaRestUrl) throws Exception {
		String url = kafkaRestUrl + "/listTopics";
		String response = HttpUtils.restService(url, "GET");

//		LOG.info(">>>>>>>>>>>> response={} ", response);

		ObjectMapper mapper = new ObjectMapper();
		JsonNode jsonNode = mapper.readTree(response);
		String topicStr = jsonNode.get("topics").asText();
		List<String> topicList = mapper.readValue(topicStr, new TypeReference<List<String>>() {});
		
		return new HashSet<>(topicList);
	}
}
