package com.cydeo.solid_principles_practice.interfaceSegregation;

public class GooglePay implements UPIPayments,CashBackManager {


    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }

    @Override
    public void getCashBackAsCreditBalance() {
        // this features is there in gpay
    }
}
