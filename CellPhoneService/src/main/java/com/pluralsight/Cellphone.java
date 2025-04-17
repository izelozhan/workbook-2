package com.pluralsight;

public class Cellphone {
    //instance variables
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    // default constructor
    public Cellphone() {
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }
    //overloaded constructor
    public Cellphone(int serialNumber, String model,String carrier, String phoneNumber, String owner) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    //dial method and overloaded dial
    public void dial(String phoneNumber){
        System.out.println(this.owner + "'s phone calling " + phoneNumber);
    }
    //cellphone object has get/set methods so I can use to get owner and phone number.
    public void dial(Cellphone phone){
        System.out.println(phone.getOwner() + "'s phone calling " + phone.getPhoneNumber());
    }
}
