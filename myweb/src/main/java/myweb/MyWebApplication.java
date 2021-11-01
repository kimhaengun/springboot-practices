package myweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class MyWebApplication {

	@RestController
	public class HelloController{
		@GetMapping("/hello")
		public String hell() {
			return "<h1>Hello</h1>";
		}
	}
	
	@RestController
	public class HelloController2{
		@GetMapping("/hello2")
		public String hell() {
			return "hello2";
		}
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MyWebApplication.class, args);	
	}
}
