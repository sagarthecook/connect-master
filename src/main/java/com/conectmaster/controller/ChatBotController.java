package com.conectmaster.controller;

import com.conectmaster.dto.Master;
import com.conectmaster.service.ChatBotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/connectmaster/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class ChatBotController {

    @Autowired
    private ChatBotService chatBotService;

    @GetMapping("/menu")
    public Master getMenu(){
        return chatBotService.getMenu();
    }
}
