package com.frozendo.hawkingds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HawkingDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HawkingDiscoveryServerApplication.class, args);
	}

}
