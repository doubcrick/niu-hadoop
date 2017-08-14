package me.niu.hadoop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("me.niu")
@SpringBootApplication
@EnableAutoConfiguration
public class NiuHadoopApplication {

	public static void main(String[] args) {
		SpringApplication.run(NiuHadoopApplication.class, args);
	}
}
