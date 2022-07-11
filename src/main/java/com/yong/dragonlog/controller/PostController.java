package com.yong.dragonlog.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class PostController {

    // Http Method
    // GET, POST, PUT, PATCH, DELETE, OPTIONS, HEAD, TRACE, CONNECT

    // SSR -> jsp, thymeleaf, mustache, freemarker
      // -> html rendering

    // SPA ->
    //  vue -> vue + SSR = nuxt
    //  react -> react + SSR = next
      // -> javascript + <-> API
    @PostMapping("/posts")
    public String post(@RequestParam String title, @RequestParam String content){
        log.info("title={}, content={}", title, content);
        return "Hello World";
    }
}
