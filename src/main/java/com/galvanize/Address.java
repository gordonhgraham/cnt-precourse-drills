package com.galvanize;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class Address {
  private String street;
  private String city;
  private String state;
  private String zip;

  public String getStreet() {
    return street;
  }

  public String getCity() {
    return city;
  }

  public String getState() {
    return state;
  }

  public String getZip() {
    return zip;
  }

  public void setStreet(String newStreet) {
    street = newStreet;
  }
  public void setCity(String newCity) {
    street = newCity;
  }
  public void setState(String newState) {
    street = newState;
  }
  public void setZip(String newZip) {
    street = newZip;
  }

}
