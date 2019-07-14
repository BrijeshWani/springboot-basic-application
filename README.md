# Springboot Basic Application & Annotations

This is play ground for trying different springboot features.

## Springboot annotations

### @SpringBootApplication
This annotation is equivalent to the @EnableAutoConfiguration, @Configuration and @ComponentScan.
So basically if you don't want to use the @SpringBootApplication annotation then you can user these three.
Where configuration is optional and used accordingly.

### @RestController
This annotation is the combination of @Controller and @ResponseBody annotations.

### @Configuration
This is used for configuration classes. For importing xml based configuration you can use @ImportResource annotation.

### @EnableAutoConfiguration
This annotation always tries to configure application in default way using added dependencies in pom file.
We can exclude some of default configurations and add our own.
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})

### @Autowired
This is used to annotate the classes and can also be used with constructor.

### @import
If you want to manually provide your components to springboot application then you can use @Import.
Basically avoid using @ComponentScan and put all your components in @Import annotation as below.
@Import({ TestController.class, TestService.class, TestServiceHelper.class })


### @PostConstruct
This annotation is used with method(non-static).
```java
	@PostConstruct
	private void postConstruct() {
		// Withh be executed after all beans init.
	}
```

## Properties while running application

### --debug
Enable debug using the --debug argument while runing application.
java -jar springboot-test-application-0.0.1-SNAPSHOT.jar --debug


## Application properties(.yml)

### spring.banner.location
This is used to set banner location.

### spring.main.banner-mode
Banner mode can be "off", "console", "log".

## Inbuild classes

### Accessing application argument
We can access application argument using the class ApplicationArguments.
This provides more sofisticted way to access application arguments.
```java
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
```

### CommandLineRunner & ApplicationRunner
These interfaces can be implemented for code which you need to execute only ones on application start.
Check below classes from this application,
springboot.on_app_start_execution.MyApplicationRunner
springboot.on_app_start_execution.MyCommandLineRunner

