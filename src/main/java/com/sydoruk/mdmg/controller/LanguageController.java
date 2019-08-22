package com.sydoruk.mdmg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LanguageController {
    private static final String LANG = "lang";
    private static final String EN = "en";
    private static final String RU = "ru";

    @GetMapping("/language")
    public String getLang(@RequestParam String lang, Model model) {
        if (RU.equals(lang)) {
            model.addAttribute(LANG, RU);
        } else {
            model.addAttribute(LANG, EN);
        }
        return "main";
    }
}
