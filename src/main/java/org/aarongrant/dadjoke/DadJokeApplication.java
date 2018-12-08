package org.aarongrant.dadjoke;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DadJokeApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(DadJokeApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}

}
