package com.example.lab04;

public class circle  extends Shape {
    private int radius;

    public circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public int getRadius() { return radius; }
    public void setRadius(int radius) { this.radius = radius; }
}
