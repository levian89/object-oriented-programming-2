package com.in28minutes.oops.level2;

public class Rectangle {

    //state
    private int length;
    private int width;

    //creation
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    //operations
    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int calculateArea() {
        return length * width;
    }

    public int calculatePerimeter() {
        return 2 * (length + width);
    }

    public String toString() {
        return String.format("length - %d, width - %d, area - %d, perimeter - %d", length, width, calculateArea(), calculatePerimeter());
    }
}
