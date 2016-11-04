package com.example.netghost.rgbcircle;

import android.graphics.Color;

import java.util.concurrent.Callable;

/**
 * Created by netghost on 29.10.16.
 */

public class MainCircle extends SimpleCircle{
    private static final int INT_RADIUS = 50;
    private static final int MAIN_SPEED = 50;
    public static final int OUR_COLOR = Color.BLUE;

    public MainCircle(int x, int y, int radius) {
        super(x, y, INT_RADIUS);
        setColor(OUR_COLOR);
    }


    public void moveMainCircleWhenTouchAt(int x1, int y1) {
        int dx = (x1-x) * MAIN_SPEED / GameManager.getWidth();
        int dy = (y1-y) * MAIN_SPEED / GameManager.getHeight();
        x += dx;
        y += dy;
    }

    public void initRadius() {
        radius = INT_RADIUS;
    }

    public void growRadius(SimpleCircle circle) {
        // pi * newr ^ 2 == pi * r ^ 2+ pi * reat^2;
        // newr = sqrt(r^2 + reat ^ 2);
        radius = (int) Math.sqrt(Math.pow(radius, 2)+ Math.pow(circle.radius, 2));
    }
}
