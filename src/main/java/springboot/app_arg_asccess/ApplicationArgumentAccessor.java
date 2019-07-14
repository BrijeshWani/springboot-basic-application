package springboot.app_arg_asccess;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class ApplicationArgumentAccessor {
	@Autowired
	public ApplicationArgumentAccessor(final ApplicationArguments applicationArguments) {
		System.out.println(applicationArguments);
	}
}
