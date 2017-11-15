package cn.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ViewController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping("/login")
    public ModelAndView index(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        String contextPath = request.getContextPath();
        modelAndView.addObject("contextPath", contextPath);
        modelAndView.setViewName("login");
        return modelAndView;
    }

    @RequestMapping("/index")
    public String home() {
        return "index";
    }
}
