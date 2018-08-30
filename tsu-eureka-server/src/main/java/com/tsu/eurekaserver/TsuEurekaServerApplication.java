package com.tsu.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author chendongsuo
 */
@EnableEurekaServer
@SpringBootApplication
public class TsuEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TsuEurekaServerApplication.class, args);
    }
}
