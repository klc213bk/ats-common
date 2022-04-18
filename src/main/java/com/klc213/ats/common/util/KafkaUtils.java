package com.klc213.ats.common.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
	
	public static String getTwsMktDataRealtimeTopic(String symbol) {
		return "TWS.MKTDATA.REALTIME." + symbol;
	}
	public static Set<String> listTopics(String kafkaBootstrapServer, String kafkaHome) throws Exception {
		ProcessBuilder builder = new ProcessBuilder();
		builder.command("sh", "-c", "./bin/kafka-topics.sh --list --bootstrap-server " + kafkaBootstrapServer);
		builder.directory(new File(kafkaHome));
		Process process = builder.start();
		process.getInputStream();
		List<String> topicList = new ArrayList<>();
		new BufferedReader(new InputStreamReader(process.getInputStream())).lines().forEach( 
				e -> topicList.add(e)
				);
		
		int exitCode = process.waitFor();
		System.out.println(">>>listTopic exitCode:" + exitCode);
		
		return new HashSet<>(topicList);
		
		
	}
	
	public static int createTopic(String kafkaBootstrapServer, String kafkaHome, String topic) throws Exception {
		
		int exitCode =  0;
		
		Set<String> topicSet = listTopics(kafkaBootstrapServer, kafkaHome);
		
		if (!topicSet.contains(topic)) {
			ProcessBuilder builder = new ProcessBuilder();
			builder.command("sh", "-c", "./bin/kafka-topics.sh --create --topic " + topic + " --bootstrap-server " + kafkaBootstrapServer);
			builder.directory(new File(kafkaHome));
			Process process = builder.start();
			process.getInputStream();
			
			exitCode = process.waitFor();	
		}
	
		return exitCode;
	
	}
	public static int deleteTopic(String kafkaBootstrapServer, String kafkaHome, String topic) throws Exception {
		int exitCode =  0;
		
		Set<String> topicSet = listTopics(kafkaBootstrapServer, kafkaHome);
		
		if (topicSet.contains(topic)) {
			ProcessBuilder builder = new ProcessBuilder();
			builder.command("sh", "-c", "./bin/kafka-topics.sh --delete --topic " + topic + " --bootstrap-server " + kafkaBootstrapServer);
			builder.directory(new File(kafkaHome));
			Process process = builder.start();
			process.getInputStream();
			
			exitCode = process.waitFor();
		}
		
		
		return exitCode;
	}
}
