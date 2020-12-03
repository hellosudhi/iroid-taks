package com.irod.taskshoppingcart.Model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name="orders")
public class OrderItems {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    @NotNull
    private String username;

    @NotNull
    private String itemname;
    @NotNull
    private String qty;

    @NotNull
    private String price;
    @NotNull
    private String status;

    public String getStatus() {
        return status;
    }

    public OrderItems setStatus(String status) {
        this.status = status;
        return this;
    }

    public int getId() {
        return Id;
    }

    public OrderItems setId(int id) {
        Id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public OrderItems setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getItemname() {
        return itemname;
    }

    public OrderItems setItemname(String itemname) {
        this.itemname = itemname;
        return this;
    }

    public String getQty() {
        return qty;
    }

    public OrderItems setQty(String qty) {
        this.qty = qty;
        return this;
    }

    public String getPrice() {
        return price;
    }

    public OrderItems setPrice(String price) {
        this.price = price;
        return this;
    }
}
