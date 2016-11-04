package com.example.netghost.rgbcircle;

import java.util.concurrent.Callable;

/**
 * Created by netghost on 29.10.16.
 */

public class MainCircle {
    private static final int INT_RADIUS = 50;
    private static final int MAIN_SPEED = 30;
    private int x;
    private int y;
    private int radius;

    public MainCircle(int x, int y) {
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

    public void moveMainCircleWhenTouchAt(int x1, int y1) {
        int dx = (x1-x) * MAIN_SPEED / GameManager.getWidth();
        int dy = (y1-y) * MAIN_SPEED / GameManager.getHeight();
        x += dx;
        y += dy;
    }

    ;
}
