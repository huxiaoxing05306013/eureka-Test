package com.testServer3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TestServer3 {
  public static void main(String[] args) {
    SpringApplication.run(TestServer3.class,args);
  }
}
