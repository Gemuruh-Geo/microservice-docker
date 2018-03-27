package com.geo.play;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.geo.play.domain")
@EnableJpaRepositories(basePackages = "com.geo.play.repository")
public class SpringbootWithDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWithDockerApplication.class, args);
	}
}
