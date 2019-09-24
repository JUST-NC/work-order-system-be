package com.just.teachersystem.Config;


import com.just.teachersystem.Intercepter.CollegeAdminIntercepter;
import com.just.teachersystem.Intercepter.OfficeAdminIntercepter;
import com.just.teachersystem.Intercepter.OnlineIntercepter;
import com.just.teachersystem.Intercepter.RootIntercepter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 拦截器配置
 */
@Configuration
public class IntercetorConfig implements WebMvcConfigurer {
    @Override
//
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new OnlineIntercepter()).addPathPatterns("/api/online/**");
        registry.addInterceptor(new OfficeAdminIntercepter()).addPathPatterns("/api/online/officeAdmin/**");
        registry.addInterceptor(new CollegeAdminIntercepter()).addPathPatterns("/api/online/collegeAdmin/**");
        registry.addInterceptor(new RootIntercepter()).addPathPatterns("/api/online/root/**");
        WebMvcConfigurer.super.addInterceptors(registry);
    }
}
