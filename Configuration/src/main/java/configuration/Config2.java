package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config2 {

	@Bean
	public Bean2 bean2() {
		return new Bean2();
	}
}
