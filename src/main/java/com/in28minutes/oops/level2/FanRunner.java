package com.in28minutes.oops.level2;

public class FanRunner
{
    public static void main( String[] args )
    {
        Fan fan = new Fan("Manufacturer 1", 0.34567, "Green");
        //System.out.println("Make: " + fan.getMake() + "," + " radius: " + fan.getRadius() + "," + " color: " + fan.getColor());
        //System.out.println(fan);
        //fan.isOn(true);
        System.out.println(fan);
        fan.switchOn();
        System.out.println(fan);
        fan.setSpeed((byte) 3);
        System.out.println(fan);
        fan.switchOff();
        System.out.println(fan);
    }
}
