package com.wad.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = { "com.wad.datamodels", "com.wad.demo"})
@EnableJpaRepositories("com.wad.demo")
@EntityScan(basePackages = {"com.wad.datamodels"})
public class CherryShop {

	public static void main(String[] args) {
		SpringApplication.run(CherryShop.class, args);
	}
}
