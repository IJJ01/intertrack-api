package io.github.ijj01.intertrack;

import org.springframework.boot.SpringApplication;

public class TestIntertrackApiApplication {

	public static void main(String[] args) {
		SpringApplication.from(IntertrackApiApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
