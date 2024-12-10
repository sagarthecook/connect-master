package com.conectmaster.controller;

import com.conectmaster.dto.conversion.Question;
import com.conectmaster.dto.request.MenuQuestion;
import com.conectmaster.dto.response.DefaultOption;
import com.conectmaster.dto.response.QuestionResponse;
import com.conectmaster.service.ChatBotService;
import org.apache.logging.log4j.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/connectmaster/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class ChatBotController {

    @Autowired
    private ChatBotService chatBotService;

    @GetMapping("/menu")
    public DefaultOption getMenu(){
        return chatBotService.getDefaultMenus();
    }

    @GetMapping("/questions/{menuId}")
    public List<Question> getQuestionsByMenu(@PathVariable String menuId){
        return chatBotService.getQuestionsByMenu(menuId);
    }

    @PostMapping("/questions")
    public QuestionResponse saveQuestion(@RequestBody MenuQuestion menuQuestion){
        return new QuestionResponse(chatBotService.saveQuestion(menuQuestion));
    }
}
