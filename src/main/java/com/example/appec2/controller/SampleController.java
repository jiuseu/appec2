package com.example.appec2.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Log4j2
@RequestMapping("/api/sample")
public class SampleController {

    @GetMapping("/getArr")
    public String[] getArr(){
        return new String[]{"AAA","BBB","CCC"};
    }
}
