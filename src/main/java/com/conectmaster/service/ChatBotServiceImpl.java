package com.conectmaster.service;

import com.conectmaster.dto.Master;
import com.conectmaster.utils.FileUtils;
import org.springframework.stereotype.Service;


@Service
public class ChatBotServiceImpl implements ChatBotService{

    @Override
    public Master getMenu() {
        Master master =  FileUtils.readMasterJSONFile();
        return master;
    }
}
