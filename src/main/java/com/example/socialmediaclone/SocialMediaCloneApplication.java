package com.example.socialmediaclone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SocialMediaCloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialMediaCloneApplication.class, args);
	}

}
