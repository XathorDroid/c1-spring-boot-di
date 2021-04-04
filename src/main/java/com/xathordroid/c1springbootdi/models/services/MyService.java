package com.xathordroid.c1springbootdi.models.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service("mySimpleService")
public class MyService implements IService {
    
    @Override
    public String randomFunction() {
        return "running something simple...";
    }
}
