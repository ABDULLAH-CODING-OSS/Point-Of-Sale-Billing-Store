/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author jatt6
 */
public class Product {
    
            private int id;
            private String name;
            private int stock;
            private String category;
            private double wsr;
            private double retailp;

    public Product() {
    }

    public Product(int id, String name, String category, int stock, int wsr, int retailp) {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.category = category;
        this.wsr = wsr;
        this.retailp = retailp;
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getWsr() {
        return wsr;
    }

    public void setWsr(double wsr) {
        this.wsr = wsr;
    }

    public double getRetailp() {
        return retailp;
    }

    public void setRetailp(double retailp) {
        this.retailp = retailp;
    }

    Object get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
            
            
            
            
            
}
