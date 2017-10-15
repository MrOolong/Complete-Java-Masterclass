package com.dennisdaubney;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Dennis", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

    }

    public static int calculateScore(String playername, int score) {
        System.out.println("Player " + playername + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }

}
