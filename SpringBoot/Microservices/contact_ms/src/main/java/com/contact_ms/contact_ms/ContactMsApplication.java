package com.contact_ms.contact_ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class ContactMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactMsApplication.class, args);
	}

}
