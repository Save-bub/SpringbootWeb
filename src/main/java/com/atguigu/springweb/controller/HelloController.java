package com.atguigu.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }


    //此处不能加@ResponseBody    会返回success字符串
    @RequestMapping("/success")
    public String success(Map<String ,Object> map){
        map.put("hello","你好");
        return "success";
    }
}
