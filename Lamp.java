package com.Babatunde;

/**
 * Created by Babatunde on 8/27/2016.
 */
public class Lamp {

    private String style;
    private boolean battery;
    private int globRating;

    /**
     *
     * @param style    the model of the lamp.
     * @param battery  the battery life .
     * @param globRating the bulb rating of the lamp.
     */
    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    /**
     * This method turn on the lam p in the room.
     */
    public void turnOn(){
        System.out.println("Lamp => Turning On ");
    }

    public String getStyle() {
        return style;
    }

    /**
     *
     * @return battery  of the lamp.
     */
    public boolean isBattery() {
        return battery;
    }


    /**
     *
     * @return  globRating of the bulb
     */
    public int getGlobRating() {
        return globRating;
    }
}
