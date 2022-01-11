package com.example.redissb.rest;

import com.example.redissb.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private RedisService redisService;

    @GetMapping("hello")
    public String hello(){
        redisService.set("cyp:"+System.currentTimeMillis(),"value:"+System.currentTimeMillis());
        return "hello";
    }
}
