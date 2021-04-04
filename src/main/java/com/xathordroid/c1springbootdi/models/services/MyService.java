package com.xathordroid.c1springbootdi.models.services;

public class MyService implements IService {
    
    @Override
    public String randomFunction() {
        return "running something simple...";
    }
}
