package com.amonxu.zhuimeng.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ZhuiMengUserApplication extends SpringBootServletInitializer{
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(ZhuiMengUserApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(ZhuiMengUserApplication.class, args);
	}
}
