package com.conectmaster.dto;

import com.conectmaster.dto.response.Menu;

import java.util.List;


public class Master {
   private String message;
   private List<Menu> menus;
    public Master(){

    }
    public Master(String message, List<Menu> menus) {
        this.message = message;
        this.menus = menus;
    }

    public String getMessage() {
        return message;
    }

    public List<Menu> getMenus() {
        return menus;
    }
}
