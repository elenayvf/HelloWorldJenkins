package com.app.HelloWorld;
import com.app.HelloWorld.hello.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@ComponentScan(basePackageClasses = HelloController.class)
public class HelloWorldApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}
