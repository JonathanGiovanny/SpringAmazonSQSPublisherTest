package com.jjo.awstests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SQSProducer {

  public static void main(String[] args) {
    SpringApplication.run(SQSProducer.class, args);
  }
}
