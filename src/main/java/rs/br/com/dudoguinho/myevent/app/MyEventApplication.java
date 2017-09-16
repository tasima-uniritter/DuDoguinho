package rs.br.com.dudoguinho.myevent.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan("rs.br.com.dudoguinho.myevent")
@SpringBootApplication
public class MyEventApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyEventApplication.class, args);
	}
}
