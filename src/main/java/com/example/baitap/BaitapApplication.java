package com.example.baitap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BaitapApplication {

	public static void main(String[] args) {
		System.out.printf("> truoc khi ioc khoi tao");
		ApplicationContext context = SpringApplication.run(BaitapApplication.class, args);
		System.out.printf("sau khi ioc khởi tạo");

	}

}
