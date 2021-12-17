package com.cts.springboot.controller;

import java.util.List;

import com.cts.springboot.model.Menu;
import com.cts.springboot.service.MenuService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/menu")
public class MenuController {
    
    private MenuService menuService;

    public MenuController(MenuService menuService) {
        super();
        this.menuService = menuService;
    }


    // not working
    @PostMapping
    public ResponseEntity<Menu> saveMenu(@RequestBody Menu menu)
    {
        return new ResponseEntity<Menu>(menuService.saveMenu(menu), HttpStatus.CREATED);
    }

    // get all menu items
    @GetMapping
    public List<Menu> getAllMenu()
    {
        return menuService.getAllMenu();
    }


    @GetMapping("{id}")
    public ResponseEntity<Menu> getMenuById(@PathVariable("id") int id){
        return new ResponseEntity<Menu>(menuService.getMenuByID(id), HttpStatus.OK);
    }


    @GetMapping("{category}")
    public ResponseEntity<Menu> getMenuByCategory(@PathVariable("category") String category){
        return new ResponseEntity<Menu>(menuService.getMenuByCategory(category), HttpStatus.OK);
    }


    


    
}
