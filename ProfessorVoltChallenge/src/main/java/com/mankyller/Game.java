package com.mankyller;

public class Game {

    private final String DESCRIPTION = "It's graduation day at Clearwater Academy, and excitement is in the air." +
            "But there's a twist! Dr. Volt, your eccentric science teacher, has always emphasized the importance of" +
            "practical knowledge. Today, he's decided to put that philosophy to the ultimate test. Just hours before the " +
            "ceremony, Dr. Volt has locked you and your classmates in the science lab and created a secret 4-digit" +
            "code that you must use to escape.";



    public static void main(String[] args) {
        Game game = new Game();
        game.beginGame();
    }

    public void beginGame() {
        System.out.println(DESCRIPTION);
        System.out.println("Press 1 to begin: ");


    }

}