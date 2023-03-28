package com.in28minutes.oops.level2;

public class RectangleRunner {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(23, 12);
        System.out.println("Length of the rectangle is: " + rectangle.getLength() + ", width of the rectangle is: " + rectangle.getWidth());
        System.out.println(rectangle);
        rectangle.setLength(50);
        rectangle.setWidth(25);
        //int length = rectangle.getLength();
        //int width = rectangle.getWidth();
        //System.out.println("New dimensions of rectangle are: " + rectangle.getLength() + " " + rectangle.getWidth());
        //System.out.println("New dimensions of rectangle are: " + rectangle);
        System.out.println(rectangle);



    }
}
