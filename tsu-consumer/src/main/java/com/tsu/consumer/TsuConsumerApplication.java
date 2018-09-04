package com.tsu.consumer;

import com.tsu.consumer.filter.AccessFilter;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * @author chendongsuo
 */
@SpringCloudApplication
@EnableEurekaClient
@EnableZuulProxy
public class TsuConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TsuConsumerApplication.class, args);
    }

    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }

}
