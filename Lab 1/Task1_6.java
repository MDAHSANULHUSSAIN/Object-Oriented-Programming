/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ahsan.lab_1;

/**
 *
 * @author ASUS
 */
public class Task1_6 {
    public static void main(String[] args) {
        int n = 25;
        int a = 0, b = 1, c;
        
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
System.out.println("The 25th Fibonacci number is: " + b);
    }
}