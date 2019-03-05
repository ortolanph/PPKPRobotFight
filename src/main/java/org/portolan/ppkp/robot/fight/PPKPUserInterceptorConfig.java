package org.portolan.ppkp.robot.fight;


import org.portolan.ppkp.robot.fight.interceptors.PPKPUserInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class PPKPUserInterceptorConfig implements WebMvcConfigurer {

    @Autowired
    private Environment environment;

    @Bean
    public PPKPUserInterceptor userInterceptor() {
        return new PPKPUserInterceptor();
    }

    private static final String EXCLUDE_ADMIN = "exclude.admin.path";

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(userInterceptor()).excludePathPatterns(environment.getProperty(EXCLUDE_ADMIN));
    }
}
