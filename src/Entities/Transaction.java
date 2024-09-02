/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author jatt6
 */

public class Transaction {
    private Product products;
    private int quantity;
    private double totalamount;

    
    
  
    public Transaction(ArrayList<Product> product, JTextField quantity1) {
    }

    public Transaction(Product products, int quantity) {
        this.products = products;
        this.quantity = quantity;
       this.totalamount = products.getRetailp()*quantity;
    }

    public Product getProducts() {
        return products;
    }

    public void setProducts(Product products) {
        this.products = products;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(double totalamount) {
        this.totalamount = totalamount;
    }

   
    
}
