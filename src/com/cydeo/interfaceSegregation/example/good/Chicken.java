package com.cydeo.interfaceSegregation.example.good;

public class Chicken implements CanEat,CanWalk{
    @Override
    public void eat() {
        System.out.println("eating");
    }

    @Override
    public void walk() {
        System.out.println("walking");
    }
}
