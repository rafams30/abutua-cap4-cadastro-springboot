package com.abutua.productbackend.models;

public class Product {

    // Atributos
    private int id;
    private String name;
    private String description;
    private int idCategory;
    private boolean promotion;
    private boolean newProduct;
    private double price;

    // Métodos Construtores
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product(int id, String name, String description, int idCategory, boolean promotion, boolean newProduct,
            double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.idCategory = idCategory;
        this.promotion = promotion;
        this.newProduct = newProduct;
        this.price = price;
    }

    public Product() {

    }

    // Métodos
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public boolean isPromotion() {
        return promotion;
    }

    public void setPromotion(boolean promotion) {
        this.promotion = promotion;
    }

    public boolean isNewProduct() {
        return newProduct;
    }

    public void setNewProduct(boolean newProduct) {
        this.newProduct = newProduct;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
