package com.example.applicationapp.controller;


import com.alibaba.fastjson.JSONObject;
import com.example.applicationapp.domain.User;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AppController {

    @RequestMapping(value = "/index",method = RequestMethod.POST)
    public String registerApp(@RequestBody @Validated List<User> user,
                              BindingResult bindingResult){
        System.out.println("------in register method-----");
        return "I am Register App";
    }

    @RequestMapping(value = "/health")
    public String health(){
        System.out.println("------in register health  method-----");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("statusTest","UP");
        return jsonObject.toString();
    }

    @RequestMapping(value = "/stop/{maxGracefulTimeout}", method = RequestMethod.DELETE)
    public String stopApp(@PathVariable("maxGracefulTimeout") String maxGracefulTimeout){
        System.out.println(maxGracefulTimeout);
        return "ok";
    }



}
