package com.Babatunde;

import java.awt.*;

/**
 * Created by Babatunde on 8/26/2016.
 */
public class Case {

    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimensions; //composition

    public Case(String model , String manufacturer, String powerSupply, Dimensions dimensions){
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    /*
     method to power on the device
     */
    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }


}
