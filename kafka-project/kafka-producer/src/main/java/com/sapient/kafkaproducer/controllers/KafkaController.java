package com.sapient.kafkaproducer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.kafkaproducer.models.Department;
import com.sapient.kafkaproducer.services.Producer;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {
	
	private final Producer producer;

	@Autowired
	public KafkaController(Producer producer) {
		this.producer = producer;
	}

	/*
	 * @PostMapping(value = "/publish") public void
	 * sendMessageToKafkaTopic(@RequestParam("message") String message) {
	 * this.producer.sendMessage(message); }
	 */
	
	@PostMapping(value = "/publish/data")
	public String sendMessageToKafkaTopic(@RequestBody Department department) {
		
		this.producer.sendMessage(department);
		return "message is sent to kafka topic";
	}
}
