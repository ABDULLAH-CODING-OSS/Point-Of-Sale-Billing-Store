
package Entities;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Store {
 private static ArrayList<Product> products;
 private static ArrayList<Registiration> employee;
 private static ArrayList<Transaction> transactions = new ArrayList();

 
 private static boolean flag=false;
      
 static{
 products =new ArrayList();
 employee=new ArrayList();
 }
  public static double calculateRevenue() {
        double totalRevenue = 0.0;
        if (transactions.isEmpty()) {
        System.out.println("No transactions to process.");
        return totalRevenue;
    }
    
        for (Transaction transaction : transactions) {
            Product product = transaction.getProducts();
          
            int quantity = transaction.getQuantity();
            
            double retailPrice = product.getRetailp();
          
            double wholesalePrice = product.getWsr();
            double revenue = (retailPrice - wholesalePrice) * quantity;

            totalRevenue += revenue;
        }
    

        return totalRevenue;
    }
 public static void recordTransaction(Product product, int quantity) {
    if (product != null && quantity > 0) {
        Transaction transaction = new Transaction(product, quantity);
        transactions.add(transaction);
    } else {
        JOptionPane.showMessageDialog(null, "Invalid product or quantity");
    }
}
 public static int getTotalTransactions() {
    return transactions.size();
}

 public static String totalSales() {
double totalSales = 0.0;
    
    for (Transaction transaction : transactions) {
        totalSales += transaction.getTotalamount();
    }
    
    return "Total Sales: $" + totalSales;
}
 
 
 public static String forgotPassword(String user){
 
  for (int i = 0; i < employee.size(); i++) {
          if (user.equals(employee.get(i).getUsername())
                 ) {
              return employee.get(i).getPassword();
          }
         
         
         
     }
  return null;
 
 
 }
 
 
 
 
 
 
 
 
 public static boolean verification(String userName, String userPass){
      for (int i = 0; i < employee.size(); i++) {
          if (userName.equals(employee.get(i).getUsername())
                  && userPass.equals(employee.get(i).getPassword())) {
              return true;
          }
         
         
         
     }
  return false;
 }
 
 
 
 
 public static void  addEmploye(Registiration e){
     if (e!=null) {
       employee.add(e);
     }
     else{
     JOptionPane.showMessageDialog(null, "Employee Data Not Recieved");
     }
 
 
 }
 
 
 
 
 
 
 
 
 
 
 
 public static void removeProducts(Product obj){
       for (int i = 0; i < products.size(); i++) {
         if(products.get(i).getId()==obj.getId()){
 products.remove(i);
 JOptionPane.showMessageDialog(null, "Deleted Successfully");
 return;
         }
       }
 }
 public static void updateProducts(int id , Product obj){
     for (int i = 0; i < products.size(); i++) {
         if(products.get(i).getId()==id){
             
         products.get(i).setName(obj.getName());
         products.get(i).setCategory(obj.getCategory());
         products.get(i).setStock(obj.getStock());
         products.get(i).setRetailp(obj.getRetailp());
         products.get(i).setWsr(obj.getWsr());
    
         JOptionPane.showMessageDialog(null, "Updated Successfully");
         }
     }
 
 
 
 }
 public static void addDummyProducts(){
     if (!flag) {
         
     
 products.add (new Product(1,"KitKat","Snacks",10,50,100));
 products.add (new Product(2,"Chiken","Meat",100,400,1000));
 products.add (new Product(3,"Apples","Fruits",110,250,300));
 products.add (new Product(4,"Bread","Others",5,70,100));
 products.add (new Product(5,"Basket","Snacks",15,200,400));
 products.add (new Product(6,"Beaf","Meat",150,300,500));
 products.add (new Product(7,"Juice","Snacks",10,50,150));
 products.add (new Product(8,"Grapes","Fruits",50,500,1500));
 flag = true;
     }}
 public static Product searchName(String name){
     for (int i = 0; i < products.size(); i++) {
         if (products.get(i).getName().equalsIgnoreCase(name)) {
             return products.get(i);
         }
         
     }
     JOptionPane.showMessageDialog(null, "Product Not Found");
         return null;
 }
 public static void addProduct(Product obj){
     if (obj!=null) {
          products.add(obj);
// JOptionPane.showMessageDialog(null, "Product added");
  }
     else{
     JOptionPane.showMessageDialog(null, "Enter The Product");
     }
 }
 // getting all products 
 public static ArrayList<Product> getAllProducts(){
 return products;
 }

    public static String forgotPassword(JTextField userName) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
