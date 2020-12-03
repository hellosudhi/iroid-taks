package com.irod.taskshoppingcart.Model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    @NotNull
    private String username;
    @NotNull
    private String password;
    @NotNull
    private String type;

    public int getId() {
        return Id;
    }

    public User setId(int id) {
        Id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getType() {
        return type;
    }

    public User setType(String type) {
        this.type = type;
        return this;
    }


}
