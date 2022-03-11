package com.DMS.DmsMicro.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class donorApi {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String home(){
        return "home";
    }

    @RequestMapping(value = "/donor",method = RequestMethod.GET)
    public String donor(){
        return "home For Donor";
    }
}
