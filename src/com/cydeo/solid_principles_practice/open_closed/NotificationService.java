package com.cydeo.solid_principles_practice.open_closed;

public interface NotificationService {

    public void sendOTP(String medium);
    public void sendTransactionReport(String medium);

}
