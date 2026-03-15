package Configuration;
import org.springframework.context.annotation.Configuration;
import java_advanced_spring.framework_java_based_annotations.Student;
import org.springframework.context.annotation.Bean;
import java_advanced_spring.framework_java_based_annotations.Project;




@Configuration
public class JavaConfigurationFile {
	
	@Bean
	public Project p1() {
		return new Project(101, "AI-Chatbot", "in progress");
	}
	@Bean
	public Student s1() {
		return new Student(1, "Arya Vajpai", "aryavajpai4141@gmail.com", p1());
	}

}
