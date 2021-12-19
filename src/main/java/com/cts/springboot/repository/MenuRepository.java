package com.cts.springboot.repository;


import java.util.List;
import java.util.Optional;

import com.cts.springboot.model.Menu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
// import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface MenuRepository extends JpaRepository<Menu, Integer>{
    // @Query("select * from food fd where fd.category=?1")
    // public List<Menu> findByCategory(String category);
}
