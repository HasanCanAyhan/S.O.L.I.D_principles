package com.cydeo.solid_principles_practice.dependencyInversion;

public interface BankCard {

    //Debit card and Credit card will implement this Interface
    void doTransaction(long amount);
}
