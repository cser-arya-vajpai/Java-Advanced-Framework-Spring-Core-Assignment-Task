package configuration;
import java_advanced.framework.spring.core.Product;
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;


@Configuration
public class JavaConfigurationFile {
	@Bean
	public Product product1() {
		return new Product(1, "adidas", "shoes", 8999.9);
	}
	

}
