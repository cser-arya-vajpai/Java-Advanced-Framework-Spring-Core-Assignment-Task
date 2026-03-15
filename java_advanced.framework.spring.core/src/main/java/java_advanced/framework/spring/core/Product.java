package java_advanced.framework.spring.core;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;


import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product implements Serializable{
	private Integer id;
	private String brand;
	private String name;
	private double price;

}
