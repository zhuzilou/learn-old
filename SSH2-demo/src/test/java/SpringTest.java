import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.IPersonService;

public class SpringTest {

	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "spring/spring.xml", "spring/spring-hibernate.xml" });
		IPersonService personService = (IPersonService) context.getBean("personService");
		personService.test();
	}

}
