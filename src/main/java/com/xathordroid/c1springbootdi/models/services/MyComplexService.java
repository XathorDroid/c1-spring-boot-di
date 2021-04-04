package com.xathordroid.c1springbootdi.models.services;

public class MyComplexService implements IService {
    
    @Override
    public String randomFunction() {
        return "running something complex...";
    }
}
