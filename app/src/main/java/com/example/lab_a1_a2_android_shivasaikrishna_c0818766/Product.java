package com.example.lab_a1_a2_android_shivasaikrishna_c0818766;

import java.util.ArrayList;

public class Product {
    public static ArrayList<Product> productArrayList= new ArrayList<>();
    private int id;
    private String name;
    private String description;
    private double price;
    private String proName;
    private String em;

    public Product(int id, String name, String description, double price, String proName, String em) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.proName = proName;
        this.em = em;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getEm() {
        return em;
    }

    public void setEm(String em) {
        this.em = em;
    }
}
