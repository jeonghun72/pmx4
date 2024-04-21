package com.pmx.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping(value ="admin/mastdate")
public class MastDataController {

    @GetMapping(value = "/")
    public String main(Model model){
        model.addAttribute("data","안녕하세요");
        return "admin/main";
    }

}
