package org.example;

public abstract class Vehicle {
    private String name;
    public Vehicle(String name){
        this.name = name;
    }

    public abstract void move();
    public abstract void stop();
    public abstract void turn();
    public abstract void acceleration();

    public void displayName(){
        System.out.println("Vehicle Name: " + name);
    }
}
