package com.react.rest.react.homeController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

//  @RequestMapping("/")
//  @CrossOrigin("*")
//  public String home(){
//    return "index";
//  }

  @RequestMapping(value = "/**/{path:[^\\.]*}")
  public String forward(){
    return "forward:/";
  }

}
