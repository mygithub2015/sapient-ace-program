package com.sapient.kafkaconsumer.configuration;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import com.sapient.kafkaconsumer.models.Department;

@EnableKafka
@Configuration
public class KafkaConsumerConfig {
	
	public ConsumerFactory<String, Department> consumerFactory(){
		
		JsonDeserializer<Department> deptDeserializer = new JsonDeserializer<>(Department.class);
		//deptDeserializer.setRemoveTypeHeaders(false);
		//deptDeserializer.addTrustedPackages("*.model");
		deptDeserializer.setUseTypeMapperForKey(true);
	    
		Map<String, Object> configs = new HashMap<>();
		configs.put(org.apache.kafka.clients.consumer.ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
		configs.put(org.apache.kafka.clients.consumer.ConsumerConfig.GROUP_ID_CONFIG, "consumer_group_0");
		//configs.put(org.apache.kafka.clients.consumer.ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		//configs.put(org.apache.kafka.clients.consumer.ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, deptDeserializer);
		//return new DefaultKafkaConsumerFactory<>(configs);
		return new DefaultKafkaConsumerFactory<>(configs, new StringDeserializer(), deptDeserializer);
	}
	
	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, Department> kafkaListenerContainerFactory(){
		ConcurrentKafkaListenerContainerFactory<String , Department> concurrentKafkaListenerContainerFactory = new ConcurrentKafkaListenerContainerFactory<>();
		concurrentKafkaListenerContainerFactory.setConsumerFactory(consumerFactory());
		return concurrentKafkaListenerContainerFactory;
	}
	


}
