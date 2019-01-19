package injection;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
	MyBean myBean;

	public Application(MyBean myBean) {
		this.myBean = myBean;
	}

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Application.class);
		app.run();
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("myBean = " + myBean);
		System.exit(0);
	}
}
