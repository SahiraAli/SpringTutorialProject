package com.sahira.practicestore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class HomeController {
    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        System.out.println(appName);
        return "index.html";
    }
}
