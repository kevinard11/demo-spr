package com.yukiii.demo.controller.demo;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("demo")
@Tag(name = "Demo", description = "Controller for demo")
public class DemoController {

    @RequestMapping(method = RequestMethod.GET)
    public String demo(){

        log.info("get demo successfully");
        return "Welcome to yukiii demo";
    }
}
