/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ahsan.lav_4;
abstract class Vehicle {
    final String manufacturerName;
    final int modelYear;
    static int totalVehicles = 0;  
    Vehicle(String manufacturerName, int modelYear) {
        this.manufacturerName = manufacturerName;
        this.modelYear = modelYear;
        totalVehicles++; 
    }

  
    static void reportStatistics() {
        System.out.println("Total vehicles created: " + totalVehicles);
    }
}


abstract class PoweredVehicle extends Vehicle {
   
    PoweredVehicle(String manufacturerName, int modelYear) {
        super(manufacturerName, modelYear); 
    }

   
    abstract void startEngine();
}


class Car extends PoweredVehicle{
   
    public Car(String manufacturerName, String model, int modelYear) {
        super(manufacturerName, modelYear); 
        System.out.println("Car - " + manufacturerName + " " + model + " (" + modelYear + "): Engine started.");
    }

   
    @Override
    void startEngine(){
        System.out.println("Car engine started.");
    }
}

class Motorcycle extends PoweredVehicle{
    public Motorcycle(String manufacturerName, String model, int modelYear){
        super(manufacturerName, modelYear);  
        System.out.println("Motorcycle -"+ manufacturerName + " " + model + " (" + modelYear + "): Engine started.");
    }

    @Override
    void startEngine() {
        System.out.println("Motorcycle engine started.");
    }
}


public class Task4_4 {
    public static void main(String[]args){
       
        Car car1 = new Car("Toyota","Corolla", 2022);
        car1.startEngine();  

        Motorcycle motorcycle1=new Motorcycle("Yamaha", "R1", 2021);
        motorcycle1.startEngine(); 
        Vehicle.reportStatistics(); 
    }
}
