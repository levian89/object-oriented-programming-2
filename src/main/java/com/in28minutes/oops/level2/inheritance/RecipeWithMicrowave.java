package com.in28minutes.oops.level2.inheritance;


public class RecipeWithMicrowave extends AbstractRecipe {
    @Override
    public void getReady() {
        System.out.println("Get the raw materials");
        System.out.println("Switch on the microwave");
    }

    @Override
    public void doTheDish() {
        System.out.println("Get stuff ready");
        System.out.println("Put it in the microwave");
    }

    @Override
    public void cleanUp() {
        System.out.println("Switch off the microwave");
        System.out.println("Clean up the utensils");
    }
}
