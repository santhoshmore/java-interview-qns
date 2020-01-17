package volvo;

// https://examples.javacodegeeks.com/enterprise-java/spring/spring-bean-life-cycle-example/

public class SpringBeanLifeCycle {
	/*
	 Write down spring bean life cycle
	 # Spring bean is responsible for managing the lifecycle of beans created through the spring container.
	 # The bean life cycle consists of post-initialization and pre-destruction callback methods. 
	 
	 **** Spring Bean Cycle ****
	 Object -> Instantiate -> populate Bean Properties -> BeanPostProcessor (postProcessBeforeInitilization()) -> @Postcontruct ->
	 InitializingBean Interface (after propertiesSet() ) -> custom 'init' method -> BeanPostProcessor (postProcessAfterInitilization())
	 -> Bean is ready -> Spring container shutdown -> @Predestroy() -> DisposableBeanInterface (destroy()) -> custom 'destroy' method 
	 ->end
	 
	 
	 * 
	 */
}
