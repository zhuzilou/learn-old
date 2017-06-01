import java.util.UUID;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Person;
import service.IPersonService;

public class HibernateTest {

	private IPersonService personService;

	/*
	 * @Before public void before() { ApplicationContext context = new
	 * ClassPathXmlApplicationContext( new String[] { "spring.xml",
	 * "spring-hibernate.xml" }); this.personService = (IPersonService)
	 * context.getBean("personService"); }
	 */

	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "spring/spring.xml", "spring/spring-hibernate.xml" });
		this.personService = (IPersonService) context.getBean("personService");
		Person person = new Person();
		person.setPid(UUID.randomUUID().toString());
		person.setName("zhangsan");
		person.setAge(23);
		this.personService.save(person);
	}

}
