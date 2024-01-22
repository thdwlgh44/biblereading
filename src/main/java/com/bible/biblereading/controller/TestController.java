package com.bible.biblereading.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class TestController {

    @GetMapping("/test")  // 스프링부트 연동
    public String getHome() {
        System.out.println("test Controller");
        return "test";
    }
}