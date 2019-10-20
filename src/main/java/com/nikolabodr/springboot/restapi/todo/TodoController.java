package com.nikolabodr.springboot.restapi.todo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {
    @GetMapping("/")
    public String list(){
        return "todo";
    }
}
