package springboot.constructor_injection;

import org.springframework.stereotype.Component;

@Component
public class TestServiceHelper {
	public String getHelp() {
		return "Help provided";
	}
}
