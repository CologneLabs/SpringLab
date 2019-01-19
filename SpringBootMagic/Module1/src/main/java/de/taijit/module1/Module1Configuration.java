package de.taijit.module1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Module1Configuration {
	public Module1Configuration() {
		System.out.println("Module1Configuration");
	}
	
	@Bean
	public Util util() {
		return new Util();
	}
}
