package java_advanced_spring.framework_java_based_annotations;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import Configuration.JavaConfigurationFile;


public class JavaApp {
	public static void execution() {
		ConfigurableApplicationContext configurableApplicationContext = new AnnotationConfigApplicationContext(JavaConfigurationFile.class);
		Student student = configurableApplicationContext.getBean("s1", Student.class);
		System.out.println(student);
		configurableApplicationContext.close();
	}

}
