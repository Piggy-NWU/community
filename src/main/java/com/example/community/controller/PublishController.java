package com.example.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @PackageName com.example.community.controller
 * @Description TODO
 * @Author zhuxingwu
 * @Date 2021/12/5 7:56 上午
 * @Version 1.0
 */
@Controller
public class PublishController {
    @GetMapping("/publish")
    public String publish(){
        return "publish";
    }

    @PostMapping("/publish")
    public String doPublish(
    @RequestParam("title") String title,
    @RequestParam("description") String description,
    @RequestParam("tag") String tag
    ){
        return "publish";
    }
}
