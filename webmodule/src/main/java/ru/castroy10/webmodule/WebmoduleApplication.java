package ru.castroy10.webmodule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WebmoduleApplication {

    public static void main(final String[] args) {
        SpringApplication.run(WebmoduleApplication.class, args);
    }

}
