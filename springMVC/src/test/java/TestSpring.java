import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import model.User;
import service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class TestSpring {
	private static Logger logger = Logger.getLogger(TestMyBatis.class);
	private ApplicationContext ac = null;
	@Resource
	private IUserService userService = null;

	@Before
	public void before() {
		ac = new ClassPathXmlApplicationContext(
				new String[] { "classpath:spring-mybatis.xml", "classpath:spring-mvc.xml" });
		userService = (IUserService) ac.getBean("userService");
	}

	@Test
	public void test() {
		User user = userService.getUserById(1);
		System.out.println(user.getUserName());
		logger.info("Value: " + user.getUserName());
	}

}
