package com.study.adminstore.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    // 요청 - 뷰 연결
    public void addViewControllers(final ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("admin");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/signup").setViewName("signup");
        registry.addViewController("/find").setViewName("find");
        registry.addViewController("/admin").setViewName("admin");
        registry.addViewController("/master").setViewName("master");

    }
}