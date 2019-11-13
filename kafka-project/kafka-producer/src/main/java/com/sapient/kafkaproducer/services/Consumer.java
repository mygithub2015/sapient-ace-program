package com.sapient.kafkaproducer.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.sapient.kafkaproducer.models.Department;

@Service
public class Consumer {
	private final Logger logger = LoggerFactory.getLogger(Consumer.class);

	/*
	 * @KafkaListener(topics = "sample_topic", groupId = "group_id") public void
	 * consume(String message) {
	 * logger.info(String.format("$$ -> Consumed Message -> %s", message)); }
	 */
	
	/*
	 * @KafkaListener(topics = "department_topic", groupId = "group_id") public void
	 * consume(Department department) {
	 * logger.info(String.format("$$ -> Consumed Message -> %s", department)); }
	 */
}