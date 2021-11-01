package ex04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 * @SpringBootApplication (메타 어노테이션/여러 어노테이션을 가지고있음)
 *  -->@SpringBootConfiguration(cf. @Configuration) 
 *     @ComponenetScan
 *     @EnableAutoConfiguration    
 */
@SpringBootApplication
public class MyApplication {
	
	public static void main(String[] args) {
	try(
		ConfigurableApplicationContext c = SpringApplication.run(MyApplication.class, args);
		){
					
		}
	}
}
