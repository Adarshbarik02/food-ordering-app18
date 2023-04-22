package com.example.myapplicationfoodapp;

public class Product {

    public String price;
    private String name;
    private String photo;
    private String description;

    public Product(String price, String name, String photo, String description) {
        this.price = price;
        this.name = name;
        this.photo = photo;
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
