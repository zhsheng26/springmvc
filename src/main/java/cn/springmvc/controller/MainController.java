package cn.springmvc.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @RequestMapping("/greeting/{name}")
    public String greeting(@PathVariable("name") String name) {
        return "hello, " + name;
    }
}
