package com.tsu.clientb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author chendongsuo
 */
@SpringBootApplication
@EnableEurekaClient
public class TsuClientBApplication {

    public static void main(String[] args) {
        SpringApplication.run(TsuClientBApplication.class, args);
    }
}
