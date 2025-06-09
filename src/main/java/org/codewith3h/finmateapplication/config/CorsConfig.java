package org.codewith3h.finmateapplication.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        System.out.println("⚙️ CorsConfig initialized...");

        registry.addMapping("/FinMateApplication/**")
                .allowedOrigins("https://test-deploy-fe-vert.vercel.app")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("*")
                .allowCredentials(true); // nếu không dùng cookie, có thể bỏ dòng này
    }
}
