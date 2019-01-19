package configuration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
	Bean1 bean1;
	Bean2 bean2;

	public Application(Bean1 bean1, Bean2 bean2) {
		this.bean1 = bean1;
		this.bean2 = bean2;
	}

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Application.class);
		app.run();
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("bean1 = " + bean1);
		bean1.saySomething();
		System.out.println("bean2 = " + bean2);
		bean2.saySomething();
		System.exit(0);
	}
}
