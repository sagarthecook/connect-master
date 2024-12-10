package com.conectmaster.dto.response;

import com.conectmaster.dto.conversion.Menu;

import java.util.List;
public record DefaultOption(String message, List<Menu> menus) {
}
