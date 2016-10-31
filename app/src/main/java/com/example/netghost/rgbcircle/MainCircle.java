package com.example.netghost.rgbcircle;

/**
 * Created by netghost on 29.10.16.
 */

public class MainCircle {
    private static final int INT_RADIUS = 50;
    private int x;
    private int y;
    private int radius;

    public MainCircle(int x, int y){
        this.x = x;
        this.y = y;
        this.radius = INT_RADIUS;
    }
    public int getRadius() {
        return radius;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
