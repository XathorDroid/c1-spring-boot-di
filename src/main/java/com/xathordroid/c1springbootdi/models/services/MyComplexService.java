package com.xathordroid.c1springbootdi.models.services;

import org.springframework.stereotype.Service;

@Service("myComplexService")
public class MyComplexService implements IService {
    
    @Override
    public String randomFunction() {
        return "running something complex...";
    }
}
