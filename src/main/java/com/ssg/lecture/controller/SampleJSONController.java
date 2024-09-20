package com.ssg.lecture.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class SampleJSONController {
    //데이터만 주고 받을 때 : ex) REST API
    @GetMapping("/helloArr")
    public String[] helloArr(){
        log.info("hello Array .....");
        return new String[]{"AAA", "BBB", "CCC"};
    }
}
