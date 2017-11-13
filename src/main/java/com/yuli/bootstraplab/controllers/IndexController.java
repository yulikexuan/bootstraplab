//: com.yuli.bootstraplab.controllers.IndexController.java


package com.yuli.bootstraplab.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"/", "/bootstrap-lab"})
    public String index() {
        return "index";
    }

}///:~