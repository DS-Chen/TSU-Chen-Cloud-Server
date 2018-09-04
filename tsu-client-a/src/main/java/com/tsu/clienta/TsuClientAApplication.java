package com.tsu.clienta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author chendongsuo
 */
@SpringBootApplication
@EnableEurekaClient
public class TsuClientAApplication {

    public static void main(String[] args) {
        SpringApplication.run(TsuClientAApplication.class, args);
    }
}
