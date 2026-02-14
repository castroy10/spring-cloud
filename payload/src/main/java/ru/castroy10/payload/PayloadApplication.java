package ru.castroy10.payload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PayloadApplication {

    public static void main(final String[] args) {
        SpringApplication.run(PayloadApplication.class, args);
    }

}
