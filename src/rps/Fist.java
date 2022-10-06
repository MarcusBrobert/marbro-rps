package rps;

public class Fist {

    public static final int ROCK = 0;
    public static final int PAPER = 1;
    public static final int SCISSORS = 2;

    //A method that when called upon returns 0, 1 or 2
    public int play() {
        return (int)(Math.random()*3);
    }
}