package com.conectmaster.dto.conversion;

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

    public void setMessage(String message) {
        this.message = message;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public String getMessage() {
        return message;
    }

    public List<Menu> getMenus() {
        return menus;
    }
}
