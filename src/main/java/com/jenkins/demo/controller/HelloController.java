package com.jenkins.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
   @RequestMapping(value = "/index",method = RequestMethod.GET)
   public String hellohtml ()
   {
       return "/index.html";
   }

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String test ()
    {
        return "/index.html";
    }
}
