package com.in28minutes.oops.level2.interfaces;

public class MarioGame implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Jumps");
    }

    @Override
    public void down() {
        System.out.println("Goes into a hole");
    }

    @Override
    public void left() {
        System.out.println("Goes backward");
    }

    @Override
    public void right() {
        System.out.println("Goes forward");
    }
}
