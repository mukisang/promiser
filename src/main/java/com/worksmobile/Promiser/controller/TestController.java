package com.worksmobile.Promiser.controller;

import com.worksmobile.Promiser.dao.TestDAO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {
    private final TestDAO testDAO;

    public TestController(TestDAO testDAO) {
        this.testDAO = testDAO;
    }

    @GetMapping("/")
    public String helloworld(){
        return "hihi";
    }
}
