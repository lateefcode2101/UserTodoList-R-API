package terra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "/User TodoList R-API/src/main/java" })
public class todolistmain {

	public static void main(String[] args) {
		SpringApplication.run(todolistmain.class, args);
		System.out.println("todolistmain start");
	}

}
