package action;

import java.util.UUID;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;

import model.Person;
import service.IPersonService;

@ParentPackage("basePackage")
@Action(value = "personAction")
@Namespace("/")
public class PersonAction {

	@Autowired
	private IPersonService personService;

	/**
	 * http://localhost:8080/SSH2-demo/personAction!test.action
	 */
	public void test() {
		System.out.println("Enter action success.");
		personService.test();
	}

	/**
	 * http://localhost:8080/SSH2-demo/personAction!savePerson.action
	 */
	public void savePerson() {
		Person person = new Person();
		person.setPid(UUID.randomUUID().toString());
		person.setName("lisi");
		person.setAge(23);
		this.personService.save(person);
	}
}
