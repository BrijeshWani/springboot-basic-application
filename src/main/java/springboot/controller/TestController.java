package springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import springboot.constructor_injection.TestService;

@RestController
@RequestMapping("/test")
public class TestController {

	@Autowired
	private TestService testService;

	@GetMapping("/")
	public @ResponseBody ResponseEntity<String> test() {
		return ResponseEntity.status(HttpStatus.OK).body("Hello world");
	}

	@GetMapping("/get-help")
	public @ResponseBody ResponseEntity<String> getHelp() {
		return ResponseEntity.status(HttpStatus.OK).body(testService.getHelp());
	}
}
