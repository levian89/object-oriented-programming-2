package com.in28minutes.oops.level2.interfaces;

public class GameRunner {
    public static void main(String[] args) {
        //MarioGame game = new MarioGame();
        //GamingConsole game = new MarioGame();
        //GamingConsole game = new ChessGame();
        GamingConsole[] games = {new MarioGame(), new ChessGame()}; //array with games

        for(GamingConsole game : games) {    // Polymorphism applies to interfaces, as well as to the inheritance concepts;
            game.up();                       // Polymorphism applied on interfaces;
            game.down();                     // Polymorphism is defined as "Same Code" with "Different Behaviour";
            game.left();                     // The methods are named the same but are called on two different
            game.right();                    // classes: MarioGame and ChessGame, so the same code is having two
        }                                    // different kinds of behavior based on whether we are using a
    }                                        // a MarioGame(), or a ChessGame(); multiple implementations of the interface
}                                            // results in polymorphism
