package com.mao.pojo;

public class Address {
    private String adress;

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Address{" +
                "adress='" + adress + '\'' +
                '}';
    }
}
