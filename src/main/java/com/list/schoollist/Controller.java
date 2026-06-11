package com.list.schoollist;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/")
    String init(){
        return "index.html";
    }


}
