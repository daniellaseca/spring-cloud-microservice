package org.microservice.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class App 
{
    @RequestMapping("/")
    String home() {
        return "latitud:2,23234 longitud:45.3222 ";
    }
 
    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }
}