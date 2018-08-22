package com.cg.EquipmentTrackingSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.cg.EquipmentTrackingSystem.bean")
@ComponentScan("com.cg.EquipmentTrackingSystem")
@EnableJpaRepositories("com.cg.EquipmentTrackingSystem")

public class EquipmentTrackingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EquipmentTrackingSystemApplication.class, args);
	}
}
