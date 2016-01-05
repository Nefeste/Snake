package com.example.snake;

/**
 * Created by i5 on 05.01.2016.
 */
public class Snake {
    public static final int INIT_RADIUS = 10;
    private int x1;
    private int y1;
    private int radius;

    public Snake(int x1, int y1) {
        this.x1 = x1;
        this.y1 = y1;
        radius = INIT_RADIUS;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getRadius() {
        return radius;
    }
}
