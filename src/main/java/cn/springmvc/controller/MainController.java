package cn.springmvc.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @RequestMapping("/greeting/{name}")
    public String greeting(@PathVariable("name") String name) {
        return "hello, " + name;
    }

    @RequestMapping("/hello")
    public String hello(@RequestParam(defaultValue = "苟") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }

    @RequestMapping("/index")
    public String index() {
        return "hello world";
    }
}
