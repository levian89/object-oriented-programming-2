package com.in28minutes.oops.level2.inheritance;

public abstract class AbstractRecipe {

    public void execute() {
        getReady();
        doTheDish();
        cleanUp();
    }

    public abstract void getReady();
    public abstract void doTheDish();
    public abstract void cleanUp();

    //prepare
    //recipe
    //cleanup
}
