package org.lxp.dailylog.config;

import org.lxp.dailylog.web.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;
import java.util.List;

/**
 * https://stackoverflow.com/questions/31082981/spring-boot-adding-http-request-interceptors
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        List<String> excludePaths = Arrays.asList("/login.json", "/logout", "/verifyCode.json",
                "/version", "/error", "/swagger-ui.html", "/swagger-resources/**", "/v2/api-docs", "/webjars/**");
        registry.addInterceptor(new LoginInterceptor()).excludePathPatterns(excludePaths).addPathPatterns("/**");
    }
}
