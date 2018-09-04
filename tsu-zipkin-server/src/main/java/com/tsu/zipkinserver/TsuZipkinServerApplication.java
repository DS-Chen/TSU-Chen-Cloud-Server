package com.tsu.zipkinserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import zipkin.server.internal.EnableZipkinServer;

/**
 * @author chendongsuo
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class TsuZipkinServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TsuZipkinServerApplication.class, args);
    }
}
