/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polban.jtk.sales;

/**
 *
 * @author Jihan
 */
public class Product {
    // Atribut private untuk menyembunyikan informasi
    private String productName;
    private double price;
    private int stock;
    // Constructor
    public Product(String productName, double price, int stock)
    {
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }
    // Getter dan Setter untuk mengontrol akses ke atribut private
    public String getProductName() {
        return productName;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price > 0) {
        this.price = price;
        } else {
            System.out.println("Harga tidak valid!");
        }
    }
    public int getStock() {
        return stock;
    }
    public void addStock(int amount) {
        if (amount > 0) {
            this.stock += amount;
        } else {
            System.out.println("Jumlah stok tidak valid!");
        }
    }
    public void sellProduct(int quantity) {
        if (quantity > 0 && quantity <= stock) {
            stock -= quantity;
            System.out.println(quantity + " " + productName + " terjual.");
         } else {
            System.out.println("Jumlah stok tidak cukup untuk penjualan.");
        }
    }
}
