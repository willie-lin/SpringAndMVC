package com.project.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by 林漠 on 2017/4/23.
 */@Entity
@Table
public class User implements Serializable {
    @Id
    @GeneratedValue
    private int id;


    private String username;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
