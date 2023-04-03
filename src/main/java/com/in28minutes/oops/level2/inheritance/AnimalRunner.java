package com.in28minutes.oops.level2.inheritance;

abstract class Animal {
    public abstract void bark();
}

class Cat extends Animal {

    @Override
    public void bark() {
        System.out.println("Meow meow");
    }
}

class Dog extends Animal {

    @Override
    public void bark() {
        System.out.println("Bow bow");
    }
}

public class AnimalRunner {

    public static void main(String[] args) {          // Polymorphism applied on inheritance; polymorphism is the same code with
        Animal[] animals = {new Cat(), new Dog()};    // different behavior; over here with abstract class we have that thing
        for(Animal animal:animals) {                  // where we are having the same code providing different behavior based on
            animal.bark();                            // what is the content of the reference variable: if the animal is pointing
        }                                             // to a Cat, a different method is executed; if the animal is pointing to
    }                                                 // a Dog another different method is executed; multiple implementations of
}                                                     // the abstract class results in polymorphism.
