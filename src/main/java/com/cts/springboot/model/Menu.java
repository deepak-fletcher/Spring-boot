package com.cts.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="food")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="title")
    private String title;
    @Column(name="category")
    private String category;
    @Column(name="price")
    private double price;
    @Column(name="description")
    private String description;

    public int getId()
    {
        return id;
    }

    public String getTitle()
    {
        return title;
    }

    public String getCategory()
    {
        return category;
    }

    public Double getPrice()
    {
        return price;
    }

    public String getDescription()
    {
        return description;
    }
}
