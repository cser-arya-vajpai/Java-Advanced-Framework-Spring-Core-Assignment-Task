package java_advanced_spring.framework_java_based_annotations;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Project implements Serializable{
	private Integer pid;
	private String name;
	private String status;

}
