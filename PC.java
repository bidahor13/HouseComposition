package com.Babatunde;

/**
 * Created by Babatunde on 8/26/2016.
 */
public class PC {
    private Case theCase; //composition
    private Monitor monitor; //composition
    private Motherboard motherboard; //composition


public PC(Case theCase, Monitor theMonitor, Motherboard theMotherboard) {
    this.theCase = theCase;
    this.monitor = theMonitor;
    this.motherboard = theMotherboard;
  }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    public void drawLogo(){
        // Display the graphical representation of the Logo.
        monitor.drawPixelAt(1200, 50, "yellow");
    }

//    private Case getTheCase() {
//        return theCase;
//    }
//
//    private  Monitor getMonitor() {
//        return monitor;
//    }
//
//    private Motherboard getMotherboard() {
//        return motherboard;
//    }
}
