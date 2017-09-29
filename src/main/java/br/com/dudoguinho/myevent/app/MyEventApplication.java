package br.com.dudoguinho.myevent.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@ComponentScan("br.com.dudoguinho")
@EntityScan("br.com.dudoguinho.myevent.model")
@EnableJpaRepositories("br.com.dudoguinho.myevent.repository")
public class MyEventApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyEventApplication.class, args);
	}
}
