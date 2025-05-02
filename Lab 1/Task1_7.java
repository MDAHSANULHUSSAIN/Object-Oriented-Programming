/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ahsan.lab_1;

/**
 *
 * @author ASUS
 */
class Student {
    String name;
    int age;
    String grade;

   
    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Grade: " + grade);
        System.out.println();
    }
}

public class Task1_7 {
    public static void main(String[] args) {
        
        Student student1 = new Student("Alice", 20, "A");
        Student student2 = new Student("Bob", 22, "B");

      student1.displayInfo();
        student2.displayInfo();
    }
}