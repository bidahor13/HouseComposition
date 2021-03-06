package com.Babatunde;

/**
 * Created by Babatunde on 8/27/2016.
 */
public class Bed {

    private String style;
    private int pillows;
    private int sheets;
    private int quilt;
    private int height;


    public Bed(String style, int pillows , int height, int sheets, int quilt){
        this.style = style;
        this.pillows = pillows;
        this.sheets = sheets;
        this.quilt =  quilt;
        this.height = height;
    }


    public void make(){
        System.out.println("Bed -> Making...");
    }


 /*
  Getter for the class
  */
    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }

    public int getHeight() {
        return height;
    }
}
