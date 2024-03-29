package reference;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Application.class);
		app.run();
	}

	@Override
	public void run(String... args) throws Exception {
		System.exit(0);
	}
}
