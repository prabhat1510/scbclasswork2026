package com.training.daytwo.interfaces;

import java.time.LocalDate;

public class Transaction implements CrediCardPayment{
    Integer transactionId;
    String transactionType;
    String transactionStatus;
    LocalDate transactionDate;

    @Override
    public void receivePayment() {

    }
}
