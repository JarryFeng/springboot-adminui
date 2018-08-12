package com.jarry.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jarry on 2018/8/12.
 */
@RestController
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
