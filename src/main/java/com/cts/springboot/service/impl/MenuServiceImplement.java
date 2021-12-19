package com.cts.springboot.service.impl;

import java.util.List;
import java.util.Optional;

import com.cts.springboot.model.Menu;
import com.cts.springboot.repository.MenuRepository;
import com.cts.springboot.service.MenuService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cts.springboot.exception.*;


@Service
public class MenuServiceImplement implements MenuService {
    //To add menu items
    @Autowired
    private MenuRepository menuRepository;

    public MenuServiceImplement(MenuRepository menuRepository) {
        super();
        this.menuRepository = menuRepository;
    }
    @Override
    public Menu saveMenu(Menu menu) {
        return menuRepository.save(menu);
    }

    
    @Override
    public List<Menu> getAllMenu() {
        return menuRepository.findAll();
    }

    
    @Override
    public Menu getMenuByID(int id) {
        Optional<Menu> menu = menuRepository.findById(id);
        if(menu.isPresent())
        {
            return menu.get();
        }
        else{
            throw new NotFoundException("Menu","Id",id);
        }
    }
    @Override
    public List<Menu> getMenuByCategory(String category) {
        // List<Menu> menu = menuRepository.findByCategory(category);
        // if(menu.isPresent())
        // {
        //     return menu.get();
        // }
        // else{
        //     throw new NotFoundException("Menu","category",category);
        // }
        return null;
    }
    


    @Override
    public void deleteMenu(int id) {
        Optional<Menu> menu = menuRepository.findById(id);
        if(menu.isPresent())
        {
            menuRepository.deleteById(id);
        }
        else{
            throw new NotFoundException("Menu","Id",id);
        }
        
    }


    @Override
    public Menu updateMenu(Menu menu, int id) {
        Menu menuItem = menuRepository.findById(id).orElseThrow(()-> new NotFoundException("Menu","Id",id));
        menuItem.setTitle(menu.getTitle());
        menuItem.setCategory(menu.getCategory());
        menuItem.setPrice(menu.getPrice());
        menuItem.setDescription(menu.getDescription());
        menuRepository.save(menuItem);
        return menuItem;
    }


    

    
    
}
