package com.blake.dev.springdataexercise.controller.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Blake on 2018/10/6
 */
@RestController
@RequestMapping("/api/hello")
public class HelloController {

    @GetMapping("/world/abc")
    public String hello() {

        return "hello world! abc";
    }

}
