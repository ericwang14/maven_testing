package com.shop.testing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ericw on 7/24/2015.
 */
@Controller
public class HelloWorldController {

    @RequestMapping(value = "/helloworld", method = RequestMethod.GET)
    public String doHelloWorld() {
        return "helloWorld";
    }
}
