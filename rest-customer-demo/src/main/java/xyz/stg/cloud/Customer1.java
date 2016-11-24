package xyz.stg.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shitiangao on 2016/11/4.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@RestController
public class Customer1 {

    @RequestMapping("/hello")
    public String hello() {
        return "client1";
    }

    public static void main(String[] args) {
        SpringApplication.run(Customer1.class);
    }
}
