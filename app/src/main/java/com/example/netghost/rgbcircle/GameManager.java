package com.example.netghost.rgbcircle;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by netghost on 29.10.16.
 */

public class GameManager {
    private MainCircle mainCircle;
    private CanvasView canvasView;
    private Paint paint;
    private static int width;
    private static int height;

    public GameManager(CanvasView canvasView, int w, int h){
        this.canvasView = canvasView;
        width = w;
        height = h;
        initMainCircle();
        initPaint();
    }
    private void initPaint() {
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
    }

    private void initMainCircle() {
        mainCircle = new MainCircle(width / 2, height / 2);
    }

    public void onDraw(Canvas canvas) {
        canvas.drawCircle(mainCircle.getX(), mainCircle.getY(), mainCircle.getRadius(), paint);
    }
}
