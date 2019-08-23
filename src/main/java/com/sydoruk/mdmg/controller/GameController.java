package com.sydoruk.mdmg.controller;

import com.sydoruk.mdmg.model.Message;
import com.sydoruk.mdmg.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

import static com.sydoruk.mdmg.util.Validator.isEmailValid;
import static com.sydoruk.mdmg.util.Validator.isMessageValid;

@Controller
public class GameController {

    @Autowired
    private MessageService messageService;

    @GetMapping("/game")
    public String getAllMessages(@RequestParam String nickname, @RequestParam String msg, Model model) {
        Optional<Message> optionalMessage = getValidMessage(nickname, msg);
        if (!optionalMessage.isPresent()) {
            model.addAttribute("messageList", messageService.findAll());
            return "game";
        }
        messageService.save(optionalMessage.get());

        model.addAttribute("messageList", messageService.findAll());

        return "game";
    }

    private Optional<Message> getValidMessage(String nickname, String msg) {

        if (!isEmailValid(nickname)) {
            return Optional.empty();
        }
        if (!isMessageValid(msg)) {
            return Optional.empty();
        }

        return Optional.of(new Message(nickname, msg));
    }
}
