package com.sapient.kafkaproducer.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.sapient.kafkaproducer.models.Department;
import com.sapient.kafkaproducer.models.Message;

@Service
public class Producer {
	private static final Logger logger = LoggerFactory.getLogger(Producer.class);
	private static final String TOPIC = "department_topic";
	
	/*
	 * @Autowired private KafkaTemplate<String, String> kafkaTemplate;
	 */
	
	@Autowired
	private KafkaTemplate<String, Department> kafkaTemplate;

	/*
	 * public void sendMessage(String message) {
	 * logger.info(String.format("$$ -> Producing message --> %s", message));
	 * this.kafkaTemplate.send(TOPIC, message.split(":")[0], message.split(":")[1]);
	 * 
	 * }
	 */

	public void sendMessage(Department department) {
		// TODO Auto-generated method stub
		logger.info(String.format("$$ -> Producing message --> %s", department));
		this.kafkaTemplate.send(TOPIC, department);
	}
}