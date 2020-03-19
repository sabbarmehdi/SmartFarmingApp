package com.diagnoPlant;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


import com.diagnoPlant.Services.StorageProperties;
@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class DiagnoPlantApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiagnoPlantApplication.class, args);
	}

	


}
