package com.in28minutes.spring.learnspringframework.enterprise.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class MyWebController {
    @Autowired
    private BusinessService businessService;

    public long returnValueFromBusinessService() {
        return businessService.calculateSum();
    }
}

@Component
class BusinessService {
    @Autowired
    private DataService dataService;
    public long calculateSum() {
        return dataService.getData().stream().reduce(0, Integer::sum);
    }
}

@Component
class DataService {
    public List<Integer> getData() {
        return Arrays.asList(10, 20, 30, 40);
    }
}
