package volvo;

public class SpringBeanScope {
	/*  https://www.tutorialspoint.com/spring/spring_bean_scopes.htm
	 Write down spring bean scope
	 
	 1. singleton - by default every bean declared in the container defaulted to Singleton.
	 2. prototype - When we declare bean scope as prototype this indicates every reference to the bean will return a unique instance of it.
	 3. request - When we declare bean scope as request, for every HTTPRequest a new bean instance will be injected
	 4. session - for every new HttpSession, new bean instance will be injected.
	 5. global-session - it has removed from Spring 3.0, This is used in Spring MVC Portlet where if we want to inject a new bean for 
	                     a Portal Session you need to use this scope.
	 */
}
