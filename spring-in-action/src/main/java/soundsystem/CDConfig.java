package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan
public class CDConfig {

	@Bean
	public CompactDisc compactDisc() {
		return new SgtPeppers();
	}
}
