package com.escuelaing.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection = "Users")
public class User {

    @Id
    private String id;

    @Field(name = "name")
    private String name;

    // Constructor con parámetros
    public User(String name) {;
        this.name = name;
    }

    // Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
