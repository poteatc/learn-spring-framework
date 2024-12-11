package com.in28minutes.spring.learnspringframework.enterprise.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class MyWebController {
    //@Autowired
    private final BusinessService businessService;

    @Autowired
    public MyWebController(BusinessService businessService) {
        this.businessService = businessService;
    }

    public long returnValueFromBusinessService() {
        return businessService.calculateSum();
    }
}

