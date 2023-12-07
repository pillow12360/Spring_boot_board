package com.example.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/hello") // Get 방식의 url 요청
    @ResponseBody // 문자열 그 자체 응답
    public String hello(){
        return "Hello SBB";
    }
}
