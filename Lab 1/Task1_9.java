/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ahsan.lab_1;

/**
 *
 * @author ASUS
 */
class Product {
    String name;
    double price;
    String category;

   
    public Product(String n, double price, String category) {
        name = n;
        this.price = price;
        this.category = category;
    }

  
    public void displayInfo() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Category: " + category);
        System.out.println();
    }
}

public class Task1_9 {
    public static void main(String[] args) {
      
        Product product1 = new Product("Laptop", 1200.00, "Electronics");
        Product product2 = new Product("Chair", 100.00, "Furniture");

         product1.displayInfo();
        product2.displayInfo();
    }
}