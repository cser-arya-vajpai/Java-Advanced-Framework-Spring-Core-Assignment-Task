package java_advanced_spring.framework_java_based_annotations;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student implements Serializable{
	
	private Integer id;
	private String name;
	private String email;
	
	private Project project;

}
