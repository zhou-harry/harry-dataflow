package com.harry.dataflow.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhouhong
 * @date 2021/10/28 14:00
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Value("${spring.application.name}")
    private String name;

    @GetMapping(value = "/name", produces = "application/json; charset=UTF-8")
    public String getTest() throws Exception {
        return "Hello " + name;
    }
}
