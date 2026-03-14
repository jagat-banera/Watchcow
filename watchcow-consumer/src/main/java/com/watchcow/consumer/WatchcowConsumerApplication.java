package com.watchcow.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
public class WatchcowConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WatchcowConsumerApplication.class, args);
	}

}
