package com.conectmaster.service;

import com.conectmaster.dto.conversion.Question;
import com.conectmaster.dto.response.DefaultOption;

import java.util.List;

public interface ChatBotService {
    public DefaultOption getDefaultMenus();
    public List<Question> getQuestionsByMenu(String menuId);
}
