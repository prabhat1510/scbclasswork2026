package com.scb.model;
//Customer -- model class whose object we are going to persist in DB
//POJO - Plain Old Java Object class
public class Customer {
    private Integer customerId;
    private String name;
    private String mailId;
    private String contact;
    private String accountType;

    public Customer() {
    }

    public Customer(Integer customerId, String name, String mailId, String contact, String accountType) {
        this.customerId = customerId;
        this.name = name;
        this.mailId = mailId;
        this.contact = contact;
        this.accountType = accountType;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", mailId='" + mailId + '\'' +
                ", contact='" + contact + '\'' +
                ", accountType='" + accountType + '\'' +
                '}';
    }
}
