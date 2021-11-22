package com.example.demo.Product;

public class Product {

    private int id;
    private double price;
    private String description;
    private String name;

    public Product(int id, double price, String description, String name) {
        this.id = id;
        this.price = price;
        this.description = description;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
