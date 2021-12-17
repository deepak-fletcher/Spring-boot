package com.cts.springboot.service;

import java.util.List;

import com.cts.springboot.model.Menu;

public interface MenuService {
    Menu saveMenu(Menu menu);
    List<Menu> getAllMenu();
    Menu getMenuByID(int id);
    Menu getMenuByCategory(String category);
}
