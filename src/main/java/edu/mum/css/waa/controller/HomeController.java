package edu.mum.css.waa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by samue on 3/19/2017.
 */
@Controller
public class HomeController {

    //Home Controller Welcome
    @RequestMapping(value = {"/welcome"})
    public String welcome(){
        System.out.println("from controller");
        return "welcome";
    }
}
