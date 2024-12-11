package com.in28minutes.spring.learnspringframework.enterprise.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessService {
    //@Autowired
    private DataService dataService;

    // CONSTRUCTOR injection is recommended
    @Autowired
    public BusinessService(DataService dataService) {
        System.out.println("Constructor Injection");
        this.dataService = dataService;
    }

    public long calculateSum() {
        return dataService.getData().stream().reduce(0, Integer::sum);
    }
    //@Autowired
    public void setDataService(DataService dataService) {
        System.out.println("Setter Injection");
        this.dataService = dataService;
    }
}
