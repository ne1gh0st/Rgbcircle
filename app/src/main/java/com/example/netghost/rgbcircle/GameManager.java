package com.example.netghost.rgbcircle;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;

import java.util.ArrayList;


/**
 * Created by netghost on 29.10.16.
 */

public class GameManager {
    public static final int MAX_CIRCLES = 10;
    private MainCircle mainCircle;
    private ArrayList<EnemyCircle> circles;
    private CanvasView canvasView;

    private static int width;
    private static int height;

    public GameManager(CanvasView canvasView, int w, int h){
        this.canvasView = canvasView;
        width = w;
        height = h;
        initMainCircle();
        initEnemyCircles();

    }

    private void initEnemyCircles() {
        circles = new ArrayList<EnemyCircle>();
        for (int i = 0; i < MAX_CIRCLES; i++){
            EnemyCircle circle;
            circle = EnemyCircle.getRandomCircle();
            circles.add(circle);
        }
        calculateAndSetCirclesColor();
    }

    private void calculateAndSetCirclesColor() {
        for (EnemyCircle circle : circles) {
            circle.setEnemyOrFoodColorDependsOn(mainCircle);
        }
    }

    public static int getWidth() {
        return width;
    }


    public static int getHeight() {
        return height;
    }


    private void initMainCircle() {
        mainCircle =  new MainCircle(width / 2, height / 2, 0);
    }

    public void onDraw() {
        canvasView.drawCircle(mainCircle);
        for (EnemyCircle circle : circles) {
            canvasView.drawCircle(circle);
        }
    }
 //   @Override
  //  public boolean onTouchEvent(MotionEvent event){
 //       return super.onTouchEvent(event);
//    }

    public void onTouchEvent(int x, int y) {
        mainCircle.moveMainCircleWhenTouchAt(x,y);
    }
}
