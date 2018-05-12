package com.baohao.departmentwebsitefrontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AlumnusController {
    @RequestMapping(value = "/alumnus", method = RequestMethod.GET)
    public String alumnus(Model model) {
        return "alumnus";
    }
}
