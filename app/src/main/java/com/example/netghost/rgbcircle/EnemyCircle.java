package com.example.netghost.rgbcircle;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by vlad_ on 04.11.2016.
 */

public class EnemyCircle extends SimpleCircle {

    public static final int FROM_RADIUS = 10;
    public static final int TO_RADIUS = 100;
    public static final int ENEMY_COLOR = Color.RED;

    public EnemyCircle(int x, int y, int radius) {
        super(x, y, radius);
    }

    public static EnemyCircle getRandomCircle() {
        Random random = new Random();
        int x = random.nextInt(GameManager.getWidth());
        int y = random.nextInt(GameManager.getHeight());
        int radius = FROM_RADIUS + random.nextInt(TO_RADIUS - FROM_RADIUS);
        EnemyCircle enemyCircle = new EnemyCircle(x, y, radius);
        enemyCircle.setColor(ENEMY_COLOR);
        return enemyCircle;
    }
}
