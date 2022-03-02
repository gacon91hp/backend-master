package com.example.baitap;

import com.example.baitap.component.Dongvat;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BaitapApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BaitapApplication.class, args);
		Running running = context.getBean(Running.class);
		System.out.printf(String.valueOf(running.test));

	}

}
