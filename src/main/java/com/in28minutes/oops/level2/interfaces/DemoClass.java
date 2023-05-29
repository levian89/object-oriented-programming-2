package com.in28minutes.oops.level2.interfaces;

interface FirstInterface {
    void myMethod(); // interface method
}

interface SecondInterface {
    void myOtherMethod(); // interface method
}


    // DemoClass "implements" FirstInterface and SecondInterface (Multiple interfaces)
    class DemoClass implements FirstInterface, SecondInterface {
        @Override
        public void myMethod() {
            System.out.println("Some text..");
        }
        @Override
        public void myOtherMethod() {
            System.out.println("Some other text...");
        }
    }

class Main {
    public static void main(String[] args) {
        DemoClass myObj = new DemoClass();
        myObj.myMethod();
        myObj.myOtherMethod();
    }
}
