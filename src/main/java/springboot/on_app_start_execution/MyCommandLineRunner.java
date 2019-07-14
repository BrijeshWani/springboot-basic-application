package springboot.on_app_start_execution;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("####################################");
		System.out.println("MyCommandLineRunner executed.");
		System.out.println("####################################");
	}

}
