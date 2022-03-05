package com.webshop.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EntityScan({"com.webshop.common.entity"})
public class WebshopBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebshopBackEndApplication.class, args);
	}

}
