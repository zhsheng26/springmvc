package cn.springmvc.controller;

import cn.springmvc.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {
    @Autowired
    private IBookService bookService;

    @RequestMapping(value = "saveBook", method = RequestMethod.GET)
    @ResponseBody
    public String savePerson() {
        bookService.saveBook();
        return "success!";
    }
}
