package entity;

import org.springframework.beans.factory.annotation.Value;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class Product implements Serializable{
	
	@Value("1")
	private Integer id;
	
	@Value("Apsara")
	private String brand;
	
	@Value("Pencil")
	private String name;
	
	@Value("29.99")
	private Double price;
}

