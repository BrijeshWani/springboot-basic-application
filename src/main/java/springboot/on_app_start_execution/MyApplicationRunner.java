package springboot.on_app_start_execution;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("####################################");
		System.out.println("MyApplicationRunner executed.");
		System.out.println("####################################");
	}

}
