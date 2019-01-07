package com.robel.demo.controller;

import com.robel.demo.model.Type;
import com.robel.demo.service.MySearchEngine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MySearchEngine engine(){
        return new MySearchEngine();
    }

    @Bean
    public Type documentType(){
        Type t = new Type();
        t.setName("WEB");
        t.setDesc("Web Link");
        t.setExtension(".url");
        return t;
    }
}
