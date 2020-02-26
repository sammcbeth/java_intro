package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your high score was: "+ highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;


        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your high score was: "+ highScore);
        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Sam", position);
        position = calculateHighScorePosition(900);
        displayHighScorePosition("Sam", position);
        position = calculateHighScorePosition(400);
        displayHighScorePosition("Sam", position);
        position = calculateHighScorePosition(50);
        displayHighScorePosition("Sam", position);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){


        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;

            return finalScore;
        }
        return -1;

    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score){
        if (score > 1000){
            return 1;
        }
        else if(score > 500){
            return 2;
        }
        else if(score > 100);{
            return 3;
        }
        //return 4;
    }
}
