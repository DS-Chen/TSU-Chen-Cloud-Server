package com.tsu.tsuconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author chendongsuo
 */
@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
public class TsuConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TsuConfigServerApplication.class, args);
	}
}
