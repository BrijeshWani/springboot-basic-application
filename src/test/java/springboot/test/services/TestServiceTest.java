package springboot.test.services;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import springboot.constructor_injection.TestService;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class TestServiceTest {
	@Autowired
	private TestService testService;

	@Test
	public void simpleTest() {
		final String helpString = testService.getHelp();
		Assert.assertTrue("Help provided".equals(helpString));
	}
}
