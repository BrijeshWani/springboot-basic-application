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