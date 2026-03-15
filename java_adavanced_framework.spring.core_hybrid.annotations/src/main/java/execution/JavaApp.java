package execution;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Product;

public class JavaApp {
	public static void execution() {
		String xmlConfigurationFile = "applicationContext.xml";
		ConfigurableApplicationContext configurableApplicationContext;
		configurableApplicationContext = new ClassPathXmlApplicationContext(xmlConfigurationFile);
		Product product = configurableApplicationContext.getBean(Product.class);
		System.out.println(product);
		configurableApplicationContext.close();
		
	}

}
