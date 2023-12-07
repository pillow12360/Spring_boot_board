package com.example.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // 이 클래스는 컨트롤러가 된다.
public class MainController {
    @GetMapping("/sbb") // 요청된 url 주소와 매핑된다.
    @ResponseBody
    public String index(){
        return "안녕하세요 sbb에 오신것을 환영합니다!!";
    }
}
