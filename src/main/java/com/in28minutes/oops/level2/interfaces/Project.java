package com.in28minutes.oops.level2.interfaces;

public class Project {

    public static void main(String[] args) {
        ComplexAlgorithm algorithm = new DummyAlgorithm();
        System.out.println(algorithm.complexAlgorithm(10,20));

        ComplexAlgorithm algorithm1 = new RealAlgorithm();
        System.out.println(algorithm1.complexAlgorithm(10,20));

    }
}
