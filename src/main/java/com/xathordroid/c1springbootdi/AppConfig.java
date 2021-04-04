package com.xathordroid.c1springbootdi;

import com.xathordroid.c1springbootdi.models.services.IService;
import com.xathordroid.c1springbootdi.models.services.MyComplexService;
import com.xathordroid.c1springbootdi.models.services.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {
    
    @Bean("mySimpleService")
    public IService registerService() {
        return new MyService();
    }

    @Primary
    @Bean("myComplexService")
    public IService registerComplexService() {
        return new MyComplexService();
    }
}
