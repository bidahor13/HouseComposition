package com.Babatunde;

import java.awt.*;

/**
 * Created by Babatunde on 8/26/2016.
 */
public class Dimensions {

    private int width;
    private int height;
    private int depth;

    public Dimensions(int width, int height, int depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }
}
