package in.cdac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * SPRING CONTAINER
 */
public class MAIN {
	// BEAN FACTORY
	public static final ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	
	public static void main(String[] args) {
		
		HelloSpring ref = (HelloSpring) context.getBean("jatin");
		System.out.println(ref);
		System.out.println(ref.sayHello());
	}
}
