package com.example.netghost.rgbcircle;

import android.graphics.Color;

import java.util.concurrent.Callable;

/**
 * Created by netghost on 29.10.16.
 */

public class MainCircle extends SimpleCircle{
    private static final int INT_RADIUS = 50;
    private static final int MAIN_SPEED = 30;
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
}
