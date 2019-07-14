package springboot.constructor_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
	private TestServiceHelper testServiceHelper;

	@Autowired
	public TestService(final TestServiceHelper testServiceHelper) {
		this.testServiceHelper = testServiceHelper;
	}

	public String getHelp() {
		return testServiceHelper.getHelp();
	}
}
