package springboot;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootClient {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootClient.class, args);
	}

	@PostConstruct
	private void postConstruct() {
		System.out.println("####################################");
		System.out.println("In post construct.");
		System.out.println("####################################");
	}

	@PreDestroy
	private void preDestroy() {
		System.out.println("####################################");
		System.out.println("In pre destroy.");
		System.out.println("####################################");
	}
}