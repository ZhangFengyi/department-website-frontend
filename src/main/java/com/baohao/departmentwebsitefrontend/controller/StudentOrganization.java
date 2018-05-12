package com.baohao.departmentwebsitefrontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentOrganization {
    @RequestMapping(value = "/student/organization", method = RequestMethod.GET)
    public String studentOrganization(Model model) {
        return "student_organization";
    }

}
