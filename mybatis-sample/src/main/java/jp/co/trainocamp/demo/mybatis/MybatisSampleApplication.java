package jp.co.trainocamp.demo.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("jp.co.trainocamp.demo.mybatis.mapper")
public class MybatisSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisSampleApplication.class, args);

	}

}
