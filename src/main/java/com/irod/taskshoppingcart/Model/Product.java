package com.irod.taskshoppingcart.Model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int Id;
    @NotNull
    private String itemname;
    @NotNull
    private String price;
    @NotNull
    private String category;

    @NotNull
    private String imageUrl;

    public String getImageUrl() {
        return imageUrl;
    }

    public Product setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public int getId() {
        return Id;
    }

    public Product setId(int id) {
        Id = id;
        return this;
    }

    public String getItemname() {
        return itemname;
    }

    public Product setItemname(String itemname) {
        this.itemname = itemname;
        return this;
    }

    public String getPrice() {
        return price;
    }

    public Product setPrice(String price) {
        this.price = price;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public Product setCategory(String category) {
        this.category = category;
        return this;
    }


}
