package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringbootConsumeRestServiceApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(SpringbootConsumeRestServiceApplication.class);

    @Value("${url.service.api}")
    private static final String URL_SERVICE_API = null;
    public static void main(String[] args) {
        SpringApplication.run(SpringbootConsumeRestServiceApplication.class);
    }

    @Override
    public void run(String... args) {
        RestTemplate restTemplate = new RestTemplate();
        Note instance = restTemplate.getForObject(URL_SERVICE_API, Note.class);
        log.info(instance.toString());
        System.out.println();
        System.out.println(instance);
        System.out.println();
    }
}

