package com.sydoruk.mdmg.controller;

import com.sydoruk.mdmg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class GetAllUsersController {
    @Autowired
    UserService userService;

    @GetMapping("/users")
    public String getAllUsers(Model model) {
        model.addAttribute("usersList", userService.findAll());
        return "users_list";
    }
}
