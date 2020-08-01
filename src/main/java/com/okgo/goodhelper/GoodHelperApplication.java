package com.okgo.goodhelper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.okgo.goodhelper.mapper")
@ComponentScan(basePackages = {"com.okgo.goodhelper","org.n3r.idworker"})
//开启定时任务
//@EnableScheduling
//开启异步任务
//@EnableAsync
public class GoodHelperApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoodHelperApplication.class, args);
	}

}
