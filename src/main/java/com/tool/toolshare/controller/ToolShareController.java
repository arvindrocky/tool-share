package com.tool.toolshare.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tool-share")
public class ToolShareController {
    @GetMapping("/hello/{name}")
    public String helloWorld(@PathVariable String name) {
        return "Hello " + name;
    }
}
