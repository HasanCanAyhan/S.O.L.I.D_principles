package com.cydeo.solid_principles_practice.dependencyInversion;

public class CreditCard  implements BankCard{

    public void doTransaction(long amount){
        System.out.println("payment using CreditCard");
    }

}
