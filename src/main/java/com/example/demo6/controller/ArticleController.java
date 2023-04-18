package com.example.demo6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ArticleController {

    @RequestMapping("index")
    public String index(){
        return "list";
    }
}
