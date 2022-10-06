package com.learning.datasources;


import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StartUp {

    @EventListener(DataSourcesApplication.class)
    public void startUp(){
        System.out.println("APP Started Succesfully");
    }
}
