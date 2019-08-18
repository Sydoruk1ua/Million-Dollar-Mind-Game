package com.sydoruk.mdmg;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {  //TODO: this class only to test that app is work. Should delete it later.
    @GetMapping("/somemap")
    public String main(Model model) {
        model.addAttribute("some", "Hello, Application! How are you?");
        return "main";
    }
}
