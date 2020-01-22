package com.cts.project.hateoas.resthateoas.model;

public class Address {

    private int houseNo;
    private String street;

    public Address(int houseNo, String street) {
        this.houseNo = houseNo;
        this.street = street;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address:"+
                "houseNo=" + houseNo +
                "street=" + street;
    }
}
