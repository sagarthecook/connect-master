package com.conectmaster.service;

import com.conectmaster.dto.conversion.Master;
import com.conectmaster.dto.conversion.Menu;
import com.conectmaster.dto.conversion.Question;
import com.conectmaster.dto.response.DefaultOption;
import com.conectmaster.utils.FileUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class ChatBotServiceImpl implements ChatBotService{
    Master master=null;
    {
        master =  FileUtils.readMasterJSONFile();
    }

    @Override
    public DefaultOption getDefaultMenus() {
        List<Menu> menus = new ArrayList<>();

        if(master!=null){
            master.getMenus().forEach(menu->{
                menus.add(new Menu(menu.getId(),menu.getName()));
            });
        }
        DefaultOption defaultOption = new DefaultOption(master.getMessage(),menus);

        return defaultOption;
    }

    @Override
    public List<Question> getQuestionsByMenu(String menuId) {
        List<Menu> menus=new ArrayList<>();
        List<Question> questions = new ArrayList<>();
        if(master!=null && menuId!=null){
           menus= master.getMenus().stream().filter(m->m.getId().equals(menuId)).collect(Collectors.toList());
        }
        if(menus!=null && menus.size()>0){
            questions= menus.get(0).getQuestions();
        }
        return questions;
    }
}
