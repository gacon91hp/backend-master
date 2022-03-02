package com.example.baitap;

import com.example.baitap.service.ItemFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BaitapApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BaitapApplication.class, args);

	}

}
