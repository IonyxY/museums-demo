package com.demo.museumsdemo.model;

public class Museum {


    private String name;
    private String address;
    private int visitors;
    private String type;
    private String cityName;

    public Museum(String name, String address, int visitors, String type, String cityName) {
        this.name = name;
        this.address = address;
        this.visitors = visitors;
        this.type = type;
        this.cityName = cityName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getVisitors() {
        return visitors;
    }

    public void setVisitors(int visitors) {
        this.visitors = visitors;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCity() {
        return cityName;
    }

    public void setCity(String cityName) {
        this.cityName = cityName;
    }
}
