package com.Babatunde;

/**
 * Created by Babatunde on 8/26/2016.
 */
public class Motherboard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

     /*
     * The non-default constructor for the motherboard
     * @returns the model
     * @returns manufacturer name
     * @return the Ram slots
     * @returns  card slots
     * @return bios name
     */

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios){
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    /*
    Loads the program on the motherboard
     */
    public void loadProgram(String programName){
        System.out.println("Program "+ programName+ "is now loading....");
    }


    /*
     * Returns the model of the motherboard.
     */
    public String getModel() {
        return model;
    }

    /*
    * Returns the Manufacturer name of the motherboard.
    */
    public String getManufacturer() {
        return manufacturer;
    }

    /*
    * Returns the number of RAm lots on  the board.
    */
    public int getRamSlots() {
        return ramSlots;
    }

    /*
    * Returns the the number of card slots on the board .
    */
    public int getCardSlots() {
        return cardSlots;
    }

    /*
    * Returns the model and name of the Bio on the motherboard.
    */
    public String getBios() {
        return bios;
    }
}
