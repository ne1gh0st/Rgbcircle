package com.example.netghost.rgbcircle;

/**
 * Created by vlad_ on 04.11.2016.
 */

public class SimpleCircle {
    protected int x;
    protected int y;
    protected int radius;
    private int color;

    public SimpleCircle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
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

    public int getColor() {
        return this.color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
