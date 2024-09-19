/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jihan
 */

package com.polban.jtk.sales;

import java.text.DecimalFormat;

// Kelas Product
class Product {
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

// Kelas Sales untuk mengelola transaksi penjualan
class Sales {
    private Product product;
    private DecimalFormat df = new DecimalFormat("#,##0.00");
    // Constructor
    public Sales(Product product) {
        this.product = product;
    }
    // Metode untuk melakukan penjualan
    public void sellProduct(int quantity) {
        System.out.println("Memproses penjualan...");
        product.sellProduct(quantity);
        System.out.println("Stok setelah penjualan: " + product.getStock());
    }
    // Metode untuk menambah stok produk
    public void restockProduct(int quantity) {
        System.out.println("Menambah stok...");
        product.addStock(quantity);
        System.out.println("Stok setelah penambahan: " + product.getStock());
    }
    // Metode untuk memperbarui harga produk
    public void updateProductPrice(double newPrice) {
        System.out.println("Memperbarui harga produk...");
        product.setPrice(newPrice);
        System.out.println("Harga baru: " + df.format(product.getPrice()));
    }
}

public class Soal1 {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 100.0, 10);
        Sales sales = new Sales(product);
        
        sales.sellProduct(3);
        sales.restockProduct(5);
        sales.updateProductPrice(14000000);
        sales.updateProductPrice(-14000000);
    }
}
