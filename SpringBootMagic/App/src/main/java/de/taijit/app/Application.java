package de.taijit.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.taijit.module1.Util;

@SpringBootApplication
//@ComponentScan(basePackages = {"de.taijit.module1"})
public class Application implements CommandLineRunner {
	
	@Autowired
	Util util;

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Application.class);
		app.run();
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("OK");
		System.exit(0);
	}
}
