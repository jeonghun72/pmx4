package com.pmx.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MainController {

    @GetMapping(value = "main")
    public String main(Model model){
        model.addAttribute("data","안녕하세요3");
        return "main";
    }

}
