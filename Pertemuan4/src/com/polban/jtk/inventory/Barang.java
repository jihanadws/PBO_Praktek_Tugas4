/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polban.jtk.inventory;

/**
 *
 * @author Jihan
 */
public class Barang {
    String kode_barang;
    String nama_barang;
    private int stok;
    
    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }
    
    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            stok += jumlah;
        }
    }
    
    public int getStok() {
        return stok;
    }
}
