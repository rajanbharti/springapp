package com.xrs.controllers;

import com.xrs.dao.StudentDao;
import com.xrs.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.SQLException;

/**
 * Created by rajan on 28/1/17.
 */
@Controller
public class StudentController {

    @Autowired
    private StudentDao studentDao;

    @GetMapping("/")
    public String loginForm(Model model) {
        model.addAttribute("login", new Student());
        return "index";
    }

    @PostMapping("/")
    public String authenticate(@ModelAttribute Student student) {

        if (studentDao.authenticate(student))
            return "studenthome";
        else
            return "index";

    }
}
