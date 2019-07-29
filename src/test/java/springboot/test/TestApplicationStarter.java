package springboot.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.test.context.TestPropertySource;

@SpringBootApplication(scanBasePackages = "springboot")
@EntityScan(basePackages = { "springboot" })
@TestPropertySource("classpath:/application.properties")
public class TestApplicationStarter {

	public static void main(final String[] args) {
		SpringApplication.run(TestApplicationStarter.class, args);
	}

}
