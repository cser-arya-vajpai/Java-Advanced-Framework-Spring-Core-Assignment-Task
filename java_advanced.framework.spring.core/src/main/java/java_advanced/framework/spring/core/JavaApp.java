package java_advanced.framework.spring.core;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuration.JavaConfigurationFile;

public class JavaApp {
	public static void execution() {
		ConfigurableApplicationContext configurableApplicationContext = new AnnotationConfigApplicationContext(JavaConfigurationFile.class);
		Product product = configurableApplicationContext.getBean("product1", Product.class);
		System.out.println(product);
		configurableApplicationContext.close();
	}

}
