package com.suyad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroservicesTimeLimiterResilience4jAppApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(MicroservicesTimeLimiterResilience4jAppApplication.class, args);
		System.out.println("SpringBoot TimeLimiter Resilience4j has been started Successfully....");
	}

}
