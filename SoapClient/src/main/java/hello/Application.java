package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import hello.wsdl.GetCityForecastByZIPResponse;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	@Bean
	CommandLineRunner lookup(WeatherClient weatherClient) {
		return args -> {
			String zipCode = "94304";

			if (args.length > 0) {
				zipCode = args[0];
			}
			GetCityForecastByZIPResponse response = weatherClient.getCityForecastByZip(zipCode);

			log.error(
					String.format("Response: City=[%s], State=[%s]", response.getGetCityForecastByZIPResult().getCity(),
							response.getGetCityForecastByZIPResult().getState()));
		};
	}

}