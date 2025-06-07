package org.codewith3h.finmateapplication.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/FinMateApplication/**")
            .allowedOrigins("https://test-deploy-fe-vert.vercel.app/") // đổi thành URL FE thật
            .allowedMethods("*");
    }
}