package com.inspire7.myspringbootproject4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

// @Configuration + @ComponentScan + EnableAutoConfiguration
@SpringBootApplication
public class MySpringBootProject4Application {

	public static void main(String[] args) {
		SpringApplication.run(MySpringBootProject4Application.class, args);

	}
}
