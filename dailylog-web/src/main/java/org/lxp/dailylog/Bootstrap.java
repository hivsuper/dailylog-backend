package org.lxp.dailylog;

import org.lxp.dailylog.filter.LogFilter;
import org.lxp.dailylog.web.swagger.SwaggerFilter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.FilterChainProxy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.DelegatingFilterProxy;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class}) // disable auto web security
public class Bootstrap {
    @Value("${dailylog.swagger.enabled}")
    private boolean swaggerAllowed;

    @Bean(name = AbstractSecurityWebApplicationInitializer.DEFAULT_FILTER_NAME)
    public FilterChainProxy getFilterChainProxy() {
        CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter("UTF-8", true);
        SwaggerFilter swaggerFilter = new SwaggerFilter(swaggerAllowed);
        LogFilter logFilter = new LogFilter();

        List<SecurityFilterChain> listOfFilterChains = new ArrayList<>();
        listOfFilterChains.add(new DefaultSecurityFilterChain(new AntPathRequestMatcher("/swagger-ui.html"),
                swaggerFilter, encodingFilter));
        listOfFilterChains.add(new DefaultSecurityFilterChain(new AntPathRequestMatcher("/swagger-resources/**"),
                swaggerFilter, encodingFilter));
        listOfFilterChains.add(new DefaultSecurityFilterChain(new AntPathRequestMatcher("/v2/api-docs"), swaggerFilter,
                encodingFilter));
        listOfFilterChains.add(new DefaultSecurityFilterChain(new AntPathRequestMatcher("/webjars/**"), swaggerFilter,
                encodingFilter));
        listOfFilterChains
                .add(new DefaultSecurityFilterChain(new AntPathRequestMatcher("/**"), encodingFilter, logFilter));
        return new FilterChainProxy(listOfFilterChains);
    }

    @Bean
    public FilterRegistrationBean<DelegatingFilterProxy> securityFilterChainRegistration() {
        DelegatingFilterProxy delegatingFilterProxy = new DelegatingFilterProxy();
        delegatingFilterProxy.setTargetBeanName(AbstractSecurityWebApplicationInitializer.DEFAULT_FILTER_NAME);
        FilterRegistrationBean<DelegatingFilterProxy> registrationBean = new FilterRegistrationBean<>(
                delegatingFilterProxy);
        registrationBean.setName(AbstractSecurityWebApplicationInitializer.DEFAULT_FILTER_NAME);
        registrationBean.addUrlPatterns("/*");
        return registrationBean;
    }

    public static void main(String[] args) {
        SpringApplication.run(Bootstrap.class, args);
    }
}
