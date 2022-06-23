package com.demo.museumsdemo.model;

public class City {

    private String cityName;
    private String country;
    private int totalMuseums;

    public City(String cityName, String country, int totalMuseums) {
        this.cityName = cityName;
        this.country = country;
        this.totalMuseums = totalMuseums;
    }

    public String getCity() {
        return cityName;
    }

    public void setCity(String cityName) {
        this.cityName = cityName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getTotalMuseums() {
        return totalMuseums;
    }

    public void setTotalMuseums(int totalMuseums) {
        this.totalMuseums = totalMuseums;
    }
}
