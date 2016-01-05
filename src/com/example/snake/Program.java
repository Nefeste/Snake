package com.example.snake;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by i5 on 05.01.2016.
 */
public class Program {
    private Snake snake;
    private CanvasView canvasView;
    private static int width;
    private static int height;

    public Program(CanvasView canvasView, int w, int h) {
        this.canvasView = canvasView;
        width = w;
        height = h;
        initSnake();
    }

    private void initSnake() {
        snake = new Snake(width / 2, height / 2);
    }

    public void onDraw() {
        canvasView.drawCircle(snake);
    }
}
