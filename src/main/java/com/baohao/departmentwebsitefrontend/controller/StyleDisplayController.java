package com.baohao.departmentwebsitefrontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StyleDisplayController {
    @RequestMapping(value = "/photo", method = RequestMethod.GET)
    public String phote(Model model) {
        return "photo";
    }
}
