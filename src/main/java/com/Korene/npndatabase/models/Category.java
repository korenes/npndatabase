package com.Korene.npndatabase.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


// means that this is the database, great example of template database
@Entity
public class Category {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String name;

    // always need an empty constructor


    public Category() {

    }

    public Category(String name){
        this.name = name;

    }

    public int getId() {
        return id;
    }
//if the id is generated you dont need a setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
