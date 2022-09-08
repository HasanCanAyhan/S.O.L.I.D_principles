package com.cydeo.solid_principles_practice.dependencyInversion;

public class ShoppingMall {

    //ShoppingMall class(high level) depends on the Debit Card Class(low level)

    //private DebitCard debitCard;
    // what if ? it must be written same code also for Credit card, that s why we should abstraction/interface between high level and low level class
    //private CreditCard creditCard;

    /*
    public ShoppingMall(DebitCard debitCard) {
        this.debitCard = debitCard;
    }

    public void doPurchaseSomething(long amount){
        debitCard.doTransaction(amount);
    }

     */


    private BankCard bankCard;

    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void doPurchaseSomething(long amount){
        bankCard.doTransaction(amount);
    }




    public static void main(String[] args) {

        /*
        DebitCard debitCard = new DebitCard();

        ShoppingMall shoppingMall = new ShoppingMall(debitCard);

        shoppingMall.doPurchaseSomething(5000);

         */


        BankCard bankCard1 = new DebitCard();
        BankCard bankCard2 = new CreditCard();


        ShoppingMall shoppingMall = new ShoppingMall(bankCard1);
        shoppingMall.doPurchaseSomething(5000);

    }


}
