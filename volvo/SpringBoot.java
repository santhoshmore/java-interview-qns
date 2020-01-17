package volvo;

public class SpringBoot {
	/*
	 
	 Why Spring Boot?
To ease the Java-based applications Development, Unit Test and Integration Test Process.
To reduce Development, Unit Test and Integration Test time by providing some defaults.
To increase Productivity.
	
list out advantages & disadvantages of Spring boot  (https://www.javapedia.net/ )
	 
	**** Advantages of using Spring Boot  ****

	# To ease the Java-based applications Development, Unit Test and Integration Test Process.
	# To reduce development, unit Test and integration Test time by providing some defaults.
	# To increase productivity.
	# It avoids writing lots of boilerplate code, annotations and XML configuration.
	# It is very easy to integrate Spring Boot Application with its Spring Ecosystem like Spring JDBC, Spring ORM, Spring Data, Spring Security etc. It follows the "Opinionated Defaults Configuration" approach to reduce developer effort.
	# It provides Embedded HTTP servers like Tomcat, Jetty etc. to develop and test our web applications very easily.
	# It provides CLI (Command Line Interface) tool to develop and test

	**** Disadvantages of Spring Boot ****
	# Spring boot may include dependencies that are not used thereby causing huge deployment file size.
	# Turning legacy spring applications into Spring boot requires a lot of effort and a time-consuming process.
	# Limited control of your application.

	 2. Spring boot annotations
	 	Component
        Service
        Repository
        Controller
	 
@Component
This annotation is used on classes to indicate a Spring component. The @Component annotation marks the Java class as a bean or component so that the component-scanning mechanism of Spring can add it into the application context.

@Controller
The @Controller annotation is used to indicate the class is a Spring controller. This annotation can be used to identify controllers for Spring MVC or Spring WebFlux.

@Service
This annotation is used on a class. @Service marks a Java class that performs some service, such as executing business logic, performing calculations, and calling external APIs. This annotation is a specialized form of the @Component annotation intended to be used in the service layer.

@Repository
This annotation is used on Java classes that directly access the database. The @Repository annotation works as a marker for any class that fulfills the role of repository or Data Access Object.

This annotation has an automatic translation feature. For example, when an exception occurs in the  @Repository, there is a handler for that exception and there is no need to add a try-catch block.
	 
	 */

}
