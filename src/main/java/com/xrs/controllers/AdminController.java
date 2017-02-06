package com.xrs.controllers;

import com.xrs.dao.AdminDao;
import com.xrs.models.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.SQLException;

/**
 * Created by rajan on 24/1/17.
 */
@Controller
public class AdminController {

    @Autowired
    AdminDao adminDao;

    @GetMapping("/login")
    public String loginForm(Model model) {
        model.addAttribute("login", new Admin());
        return "instructor";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute Admin admin) {

        String uType = adminDao.autheticate(admin);

        switch (uType) {
            case "AD":
                return "adminhome";
            case "IN":
                return "instructorhome";
            case "AI":
                return "fulladmin";
            default:
                return "login";
        }

    }

}
