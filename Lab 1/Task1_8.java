/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ahsan.lab_1;

/**
 *
 * @author ASUS
 */
class Book {
    String title;
    int year;
    String author;

   
    public Book(String title, int year, String author) {
        this.title =title;
        this.year =year;
        this.author =author;
    }

 public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + year);
        System.out.println("Author: " + author);
        System.out.println();
    }
}

public class Task1_8 {
    public static void main(String[] args) {
        // Create Book instances
        Book book1 =new Book("Java Programming", 2021, "John Doe");
        Book book2 =new Book("Data Structures", 2019, "Jane Smith");

       book1.displayInfo();
        book2.displayInfo();
    }
}